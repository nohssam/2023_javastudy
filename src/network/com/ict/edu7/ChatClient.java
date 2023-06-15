package network.com.ict.edu7;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ChatClient extends JFrame implements Runnable{
	
	CardLayout cardLayout;
	JPanel pg , login_p, wait_p, chat_p;
	JLabel img ;
	JButton login_bt, memo_bt, join_bt, mkRoom_bt, exit_bt,  send_bt, out_bt;
	JList user_list, room_list, join_list; 
	JTextField msg_tf;
	JTextArea jta ;
	// 접속
	Socket s = null;
	ObjectOutputStream out= null;
	ObjectInputStream in = null;
	
	public ChatClient() {
		super("멀티 채팅");
		cardLayout = new CardLayout();
		pg = new JPanel();
		pg.setBorder(new EmptyBorder(10,10,10,10));
		pg.setLayout(cardLayout);
		
		// 첫번재 카드
		login_p = new JPanel(new BorderLayout());
		
		img = new JLabel("");
		img.setHorizontalAlignment(SwingConstants.CENTER);
		img.setIcon(new ImageIcon(ChatClient.class.getResource("/images/chat.PNG")));
		
		JPanel jp1 = new JPanel(new GridLayout(2,1));
		JPanel jp1_1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jp1_1.add(new JLabel("닉네임 : "));
		JTextField nickname_tf = new JTextField(10);
		jp1_1.add(nickname_tf);
		
		JPanel jp1_2 =new JPanel(new FlowLayout(FlowLayout.RIGHT));
		login_bt = new JButton(" 입장하기 ");
		jp1_2.add(login_bt);
		
		jp1.add(jp1_1);
		jp1.add(jp1_2);
		
		login_p.add(img, BorderLayout.CENTER);
		login_p.add(jp1, BorderLayout.SOUTH);
			
		
		// 두번째 카드
		wait_p = new JPanel();
		wait_p.setLayout(new BorderLayout());
		
		// 동쪽
		JPanel east_p = new JPanel();
		east_p.setLayout(new BorderLayout());
		wait_p.add(east_p, BorderLayout.EAST);
		
		// 크기 지정
		east_p.setPreferredSize(new Dimension(120,300));
		east_p.add(new JLabel(" [대기실] "), BorderLayout.NORTH);
		
		user_list = new JList();
		JScrollPane jsp = new JScrollPane();
		jsp.setViewportView(user_list);
		east_p.add(jsp, BorderLayout.CENTER);
		
		
		
	    JPanel east_south = new JPanel();
	    east_south.setLayout(new GridLayout(4,1,0,0));
	    memo_bt = new JButton("쪽지보내기");
	    join_bt = new JButton("방 참여");
	    mkRoom_bt = new JButton("방 만들기");
	    exit_bt = new JButton("종료");
	    
	    east_south.add(memo_bt);
	    east_south.add(join_bt);
	    east_south.add(mkRoom_bt);
	    east_south.add(exit_bt);
	    east_p.add(east_south, BorderLayout.SOUTH);
	    
	    JPanel center_p = new JPanel();
	    center_p.setLayout(new BorderLayout());
	    
	    center_p.add(new JLabel("[ 방 제목 ] "), BorderLayout.NORTH);
	    
	    room_list = new JList();
	    room_list.setFont(new Font("굴림", Font.BOLD, 20));
	    
	    JScrollPane jsp2 = new JScrollPane();
		jsp2.setViewportView(room_list);
		center_p.add(jsp2, BorderLayout.CENTER);
		
		wait_p.add(center_p, BorderLayout.CENTER);
		
		// 세번째 카드 
		chat_p = new JPanel();
		chat_p.setLayout(new BorderLayout());
		
		JPanel ch_east = new JPanel();
		ch_east.setLayout(new BorderLayout());
		ch_east.setPreferredSize(new Dimension(90,300));
		ch_east.add(new JLabel(" [참여자] "), BorderLayout.NORTH);
		
		join_list = new JList();
		JScrollPane jsp3 = new JScrollPane();
		jsp3.setViewportView(join_list);
		ch_east.add(jsp3, BorderLayout.CENTER);
		
		out_bt = new JButton("방 나가기");
		ch_east.add(out_bt, BorderLayout.SOUTH);
		
		
		JPanel ch_center = new JPanel();
		ch_center.setLayout(new BorderLayout());
		
		jta = new JTextArea();
		jta.setEditable(false);
		jta.setLineWrap(true);
		JScrollPane jsp4 = new JScrollPane(jta, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		ch_center.add(jsp4, BorderLayout.CENTER);
		
		JPanel center_south = new JPanel();
		center_south.setLayout(new BorderLayout());
		
		msg_tf = new JTextField();
		send_bt = new JButton("보내기");
		
		center_south.add(msg_tf, BorderLayout.CENTER);
		center_south.add(send_bt, BorderLayout.EAST);
		
		ch_center.add(center_south, BorderLayout.SOUTH);
		
		chat_p.add(ch_east, BorderLayout.EAST);
		chat_p.add(ch_center, BorderLayout.CENTER);
		
		
		pg.add(login_p, "login");
		pg.add(wait_p, "wait");
		pg.add(chat_p, "chat");
		
		// 첫 카드를 지정 
		cardLayout.show(pg, "login");	
		
		add(pg);
		setSize(450, 550);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
		// 창 닫기 
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				if(s != null) { // 접속된 상태
					Protocol p = new Protocol();
					p.setCmd(0);
					try {
						out.writeObject(p);
						out.flush();
					} catch (Exception e2) {
					}
				}else {
					closed();
				}
			}
		});
		
		// 입장하기 
		login_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = nickname_tf.getText().trim();
				if(name.length() > 0) {
					// 서버 접속
					if(connected()) {
						try {
							// 닉네임 보내기
							Protocol p = new Protocol();
							p.setCmd(2);
							p.setMsg(name);
							out.writeObject(p);
							cardLayout.show(pg, "wait");
						} catch (Exception e2) {
						}
					}
				}else {
					JOptionPane.showMessageDialog(getParent(), "닉메임 입력하세요");
					nickname_tf.setText("");
					nickname_tf.requestFocus();
				}
			}
		});
		
		exit_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Protocol p = new Protocol();
					p.setCmd(0);
					out.writeObject(p);
				} catch (Exception e2) {
				}
			}
		});
		
		memo_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String msg = JOptionPane.showInputDialog("내용을 입력하세요");
					if(msg.length()<= 0 || msg == null) {
						JOptionPane.showMessageDialog(getParent(), "내용을 입력하세요");
					}else {
						Protocol p = new Protocol();
						p.setCmd(6);
						p.setMsg(msg);
						// 대기실 리스트에서 특정 사람 선택
						 p.setC_index(user_list.getSelectedIndex());
						 
						 out.writeObject(p);
						 out.flush();
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		
		mkRoom_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 사용자에게 방 제목을 받자 
				String name = JOptionPane.showInputDialog(getParent()," 방 제목을 입력하세요");
				if(name.length()<= 0 || name == null) {
					JOptionPane.showMessageDialog(getParent(), "방 제목을 입력하세요");
				}else {
					try {
						Protocol p = new Protocol();
						p.setCmd(3);
						p.setMsg(name);
						
						out.writeObject(p);
						out.flush();
						cardLayout.show(pg, "chat");
					} catch (Exception e2) {
					}
					
				}
			}
		});
		join_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int r_index =  room_list.getSelectedIndex();
				if(r_index>=0) {
					try {
						Protocol p = new Protocol();
						p.setCmd(4);
						p.setR_index(r_index);
						out.writeObject(p);
						out.flush();
						cardLayout.show(pg, "chat");
					} catch (Exception e2) {
					}
				}
			}
		});
		
		send_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMessage();
			}
		});
		msg_tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMessage();
			}
		});
		
		// 방 나가기
		out_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					jta.setText("");
					Protocol p = new Protocol();
					p.setCmd(5);
					out.writeObject(p);
					out.flush();
					cardLayout.show(pg, "wait");
				} catch (Exception e2) {
				}
				
			}
		});
		
	}
	
	private boolean connected() {
		boolean value = true;
		try {
			s = new Socket("192.168.0.41", 7779);
			out = new ObjectOutputStream(s.getOutputStream());
			in = new ObjectInputStream(s.getInputStream());
			new Thread(this).start();
			return value;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
	private void closed() {
		try {
			out.close();
			in.close();
			s.close();
			System.exit(0);
		} catch (Exception e) {
		}
	}
	private void sendMessage(){
		try {
			String msg = msg_tf.getText().trim();
			if(msg.length()>0) {
				Protocol p = new Protocol();
				p.setCmd(1);
				p.setMsg(msg);
				out.writeObject(p);
				out.flush();
				msg_tf.setText("");
				msg_tf.requestFocus();
			}
		} catch (Exception e) {
		}
	}
	@Override
	public void run() {
		esc:while(true) {
			try {
				Object obj = in.readObject();
				if(obj != null) {
					Protocol p = (Protocol)obj;
					switch (p.getCmd()) {
						case 0 : // 종료 
							break esc;
						case 1 : // 메세지 전달
							jta.append(p.getMsg()+"\n");
							// jta.setCaretPosition(jta.getText().length());
							break;
						case 2 :
							// 접속 및 갱신
							// 대기자 명단
							user_list.setListData(p.getNames());
							//  방 목록 
							room_list.setListData(p.getRooms());
							break;
						case 4 : // 방 참여
							join_list.setListData(p.getNames());
							jta.append(p.getMsg()+"\n");
							break;	
						case 6 : // 쪽지
							JOptionPane.showMessageDialog(getParent(), p.getMsg());
							break;	
					}
				}
			} catch (Exception e) {
			}
		} // 무한 루프 끝
		closed();
		System.exit(0);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new ChatClient();
			}
		});
	}
}
