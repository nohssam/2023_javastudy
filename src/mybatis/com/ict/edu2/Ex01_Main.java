package mybatis.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import jdbc.com.ict.edu5.Ex02_DAO;
import jdbc.com.ict.edu5.Ex02_VO;

public class Ex01_Main extends JFrame{
	JPanel jp1, jp2, jp3, jp4, jp5, jp6;
	JTextField jtf1, jtf2, jtf3, jtf4;
	JButton jb1, jb2, jb3, jb4; 
	JTextArea jta;
	JScrollPane jsp;
	public Ex01_Main() {
		super("DB 연동 정보");
		jp1 = new JPanel(new GridLayout(0, 2));
		jp2 = new JPanel(new GridLayout(0, 2));
		jp3 = new JPanel(new GridLayout(0, 2));
		jp4 = new JPanel(new GridLayout(0, 2));
		jp5 = new JPanel(new GridLayout(4, 0));
		jp6 = new JPanel();

		jtf1 = new JTextField();
		jtf2 = new JTextField();
		jtf3 = new JTextField();
		jtf4 = new JTextField();

		jb1 = new JButton("전체보기");
		jb2 = new JButton("삽입");
		jb3 = new JButton("삭제");
		jb4 = new JButton("검색");
		

		jp1.add(new JLabel("* CUSTID  :  ", JLabel.CENTER));
		jp1.add(jtf1);

		jp2.add(new JLabel("NAME  :  ", JLabel.CENTER));
		jp2.add(jtf2);

		jp3.add(new JLabel("ADDRESS  :  ", JLabel.CENTER));
		jp3.add(jtf3);

		jp4.add(new JLabel("PHONE  :  ", JLabel.CENTER));
		jp4.add(jtf4);

		jp5.add(jp1);
		jp5.add(jp2);
		jp5.add(jp3);
		jp5.add(jp4);

		jta = new JTextArea();
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);

		jp6.add(jb1);
		jp6.add(jb2);
		jp6.add(jb3);
		jp6.add(jb4);

		add(jp5, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp6, BorderLayout.SOUTH);

		setSize(600, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jta.setFont(new Font("굴림",Font.PLAIN,15));
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					jta.setText("");
				    List<VO> list = DAO.getList();
				    jta.append("\n\t\t 회원 전체 정보 \n\n");
				    jta.append("\t번호\t이름\t주소\t전화번호\n");
				    for (VO k : list) {
						jta.append("\t"+k.getCustid()+"\t");
						jta.append(k.getName()+"\t");
						jta.append(k.getAddress()+"\t");
						jta.append(k.getPhone()+"\n");
					}
				}
			
		});
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String custid = jtf1.getText().trim();
				String name = jtf2.getText().trim();
				String address = jtf3.getText().trim();
				String phone = jtf4.getText().trim();
				
				// custid가 null 이면 삽입불가
				if(custid.length()>0) {
					// custid 중복이면 삽입불가
					boolean idchk = DAO.getIdChk(custid);
					// false 중복
					if(idchk) {
						jta.setText("");
						VO vo = new VO();
						vo.setCustid(custid);
						vo.setName(name);
						vo.setAddress(address);
						vo.setPhone(phone);
						int res = DAO.getInsert(vo);
						if(res>0) {
							JOptionPane.showMessageDialog(getParent(), "삽입 성공");
							List<VO> list = DAO.getList();
						    jta.append("\n\t\t 회원 전체 정보 \n\n");
						    jta.append("\t번호\t이름\t주소\t전화번호\n");
						    for (VO k : list) {
								jta.append("\t"+k.getCustid()+"\t");
								jta.append(k.getName()+"\t");
								jta.append(k.getAddress()+"\t");
								jta.append(k.getPhone()+"\n");
							}
						}else {
							JOptionPane.showMessageDialog(getParent(), "삽입 실패");
						}
					
					}else {
						JOptionPane.showMessageDialog(getParent(), "같은 custid가 존재합니다.");
					}
				}else {
					JOptionPane.showMessageDialog(getParent(), "custid를 입력해주세요");
				}
				jtf1.setText("");
				jtf2.setText("");
				jtf3.setText("");
				jtf4.setText("");
			}
		});
		
		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String custid = jtf1.getText().trim();
				if(custid.length()>0) {
					// custid 중복이면 삭제가능
					boolean idchk = DAO.getIdChk(custid);
					jta.setText("");
					// false 중복
					if(idchk) {
						JOptionPane.showMessageDialog(getParent(), "custid가 존재하지 않습니다.");
						List<VO> list = DAO.getList();
						 jta.append("\n\t\t 회원 전체 정보 \n\n");
						 jta.append("\t번호\t이름\t주소\t전화번호\n");
						 for (VO k : list) {
							 jta.append("\t"+k.getCustid()+"\t");
							 jta.append(k.getName()+"\t");
							 jta.append(k.getAddress()+"\t");
							 jta.append(k.getPhone()+"\n");
						}
					}else {
						VO vo = new VO();
						vo.setCustid(custid);
						int result = DAO.getDelete(vo);
						if(result >0) {
							JOptionPane.showMessageDialog(getParent(), "삭제 성공");
							List<VO> list = DAO.getList();
							 jta.append("\n\t\t 회원 전체 정보 \n\n");
							 jta.append("\t번호\t이름\t주소\t전화번호\n");
							 for (VO k : list) {
								 jta.append("\t"+k.getCustid()+"\t");
								 jta.append(k.getName()+"\t");
								 jta.append(k.getAddress()+"\t");
								 jta.append(k.getPhone()+"\n");
							}
							
						}else {
							JOptionPane.showMessageDialog(getParent(), "삭제 실패");
						}
					}
				}else {
					JOptionPane.showMessageDialog(getParent(), "custid를 입력해주세요");
				}
				jtf1.setText("");
				jtf2.setText("");
				jtf3.setText("");
				jtf4.setText("");
			}
		});
		jb4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton obj = (JButton)(e.getSource());
				String msg = obj.getText();
				if(msg.equals("검색")) {
					String custid = jtf1.getText().trim();
					if(custid.length()>0) {
						// custid 중복이면 검색가능
						boolean idchk = DAO.getIdChk(custid);
						jta.setText("");
						// false 중복
						if(idchk) {
							JOptionPane.showMessageDialog(getParent(), "custid가 존재하지 않습니다.");
						}else {
							VO vo = DAO.getOne(custid);
							jtf2.setText(vo.getName());
							jtf3.setText(vo.getAddress());
							jtf4.setText(vo.getPhone());
							jtf1.setEditable(false);
							jb4.setText("고치기");
							jb1.setEnabled(false);
							jb2.setEnabled(false);
							jb3.setEnabled(false);
						} 
					}else {
						JOptionPane.showMessageDialog(getParent(), "custid를 입력해주세요");	
					}
					
				}else if(msg.equals("고치기")) {
					VO vo = new VO();
					vo.setCustid(jtf1.getText());
					vo.setName(jtf2.getText());
					vo.setAddress(jtf3.getText());
					vo.setPhone(jtf4.getText());
					
					int result = DAO.getUpdate(vo);
					if(result >0) {
						jta.setText("");
						JOptionPane.showMessageDialog(getParent(), "수정 성공");
						List<VO> list = DAO.getList();
						 jta.append("\n\t\t 회원 전체 정보 \n\n");
						 jta.append("\t번호\t이름\t주소\t전화번호\n");
						 for (VO k : list) {
							 jta.append("\t"+k.getCustid()+"\t");
							 jta.append(k.getName()+"\t");
							 jta.append(k.getAddress()+"\t");
							 jta.append(k.getPhone()+"\n");
						}
					}
					
					jb4.setText("검색");
					jb1.setEnabled(true);
					jb2.setEnabled(true);
					jb3.setEnabled(true);
					jtf1.setText("");
					jtf1.setEditable(true);
					jtf2.setText("");
					jtf3.setText("");
					jtf4.setText("");
				}
			}
		});
	}
	public static void main(String[] args) {
		new Ex01_Main();
	}
}
