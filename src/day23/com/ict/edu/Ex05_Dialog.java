package day23.com.ict.edu;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex05_Dialog extends JFrame{
	JPanel jp;
	JButton jb1, jb2, jb3, jb4, jb5, jb6;
	public Ex05_Dialog() {
		super("다이얼로그");
		
		jp = new JPanel();
		jb1 = new JButton("메세지");
		jb2 = new JButton("확인");
		jb3 = new JButton("입력");
		jb4 = new JButton("옵션");
		jb5 = new JButton("파일열기");
		jb6 = new JButton("파일저장");

		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jb6);
		
		add(jp);
		setSize(500,100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex05_Dialog();
	}
}
