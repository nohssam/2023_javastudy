package day27.com.ict.edu;

import java.awt.FileDialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

// 메뉴 : 메뉴바, 메뉴, 메뉴아이템
// 메뉴바에 메뉴를 붙인다. 메뉴에 메뉴아이템을 붙인다., 
// 메뉴아이템 -> 메뉴 -> 메뉴바 -> 프레임
// 메뉴바는 프레임에 붙인다. (setJMenuBar)
public class Ex07_Menu extends JFrame{
	JTextArea jta;
	JScrollPane jsp;
	JMenuBar jmb;
	JMenu m_file, m_form, font_form, m_help;
	JMenuItem i_newFile, i_openFile, i_saveFile, i_exitFile, i_item1, i_item2, i_item3, i_help, i_info; 
	public Ex07_Menu() {
		super("간단메모장");
		jta =new JTextArea();
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		
		// 메뉴바, 메뉴, 메뉴 아이템 순으로 생성 
		jmb = new JMenuBar();
		
		m_file = new JMenu(" 파  일 "); 
		m_form = new JMenu(" 서  식 "); 
		font_form = new JMenu(" 글자서식 "); 
		m_help  = new JMenu(" 도 움 말 ");
		
		i_newFile = new JMenuItem(" 새파일 ");
		i_openFile = new JMenuItem(" 열  기 ...");
		i_saveFile = new JMenuItem(" 저  장 ...");
        i_exitFile = new JMenuItem(" 종  료 ");
        i_item1 = new JMenuItem(" 도 움, 기울기, 30 ");
        i_item2 = new JMenuItem(" 궁 서, 굵 게, 40 ");
        i_item3 = new JMenuItem(" 굴 림, 기 본, 20");
        i_help = new JMenuItem(" 도 움 말 ");
        i_info = new JMenuItem(" 메모장 정보");
		
		// 메뉴아이템을 메뉴에 붙이자  
        m_file.add(i_newFile);
        m_file.add(i_openFile);
        m_file.addSeparator();
        m_file.add(i_saveFile);
        m_file.addSeparator();
        m_file.add(i_exitFile);
        
        m_form.add(font_form);
        font_form.add(i_item1);
        font_form.add(i_item2);
        font_form.add(i_item3);
        
        m_help.add(i_help);
        m_help.add(i_info);
        
        // 메뉴를 메뉴바에 붙이자.
        jmb.add(m_file);
        jmb.add(m_form);
        jmb.add(m_help);
        
		// 메뉴바를 프레임 붙인다.
		setJMenuBar(jmb);
		add(jsp);
		
		setSize(600, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		// 새파일
		i_newFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			    // 메모장 안에 글자 존재 여부 판단.
				 int size = jta.getText().length();
				 if(size == 0) {
					 jta.setText("");
				 }else {
					 int res = JOptionPane.showOptionDialog(getParent(), "변경 내용을 제목 없음에 저장하시겠습니까?",
						 "간단 메모장", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
					 if(res == 0) {
						 // 실제 저장하는 코드
					 }else if(res == 1) {
						 jta.setText("");
					 }else if(res == 2) {
						 return;
					 }
				 }
			}
		});
		// 열기
		i_openFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 파일 열기 다이얼 로그 
				FileDialog fd = new FileDialog((JFrame)getParent(),"불러오기", FileDialog.LOAD);
				fd.setVisible(true);
				// 실제 불러오는 코딩( I/O )
			}
		});
		// 저장
		i_saveFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 파일 저장 다이얼 로그 
				FileDialog fd = new FileDialog((JFrame)getParent(),"저장하기", FileDialog.SAVE);
				fd.setVisible(true);
				// 실제 저장하는 코딩( I/O )
			}
		});
		i_exitFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				// 원래는 내용이 변경되면 저장할지를 물어보고 
				// 내요이 변경되지 않으면 그냥 종료.
			}
		});
		
		i_item1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 돋움, 기울기, 30 
				// Font font = new Font(글꼴,스타일,사이즈);
				Font font = new Font("돋움",Font.ITALIC,30);
				jta.setFont(font);
			}
		});
		i_item2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 궁서, 굵게, 40 
				Font font = new Font("궁서",Font.BOLD,40);
				jta.setFont(font);
			}
		});
		i_item3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 굴림, 기본, 20 
				Font font = new Font("굴림",Font.PLAIN,20);
				jta.setFont(font);
			}
		});
		i_help.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 메세지창 호출
				JOptionPane.showMessageDialog(getParent(), " 도움말 " );
			}
		});
		i_info.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 메세지창 호출
				JOptionPane.showMessageDialog(getParent(), " 간단 메모장 정보 " );
			}
		});
	}
	public static void main(String[] args) {
		new Ex07_Menu();
	}
}









