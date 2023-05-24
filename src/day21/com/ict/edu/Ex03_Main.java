package day21.com.ict.edu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex03_Main extends JFrame{
	JPanel jp;
	JButton jb1, jb2 ;
	
	public Ex03_Main() {
		super("여러 창 사용하기");
		jp = new JPanel();
		jb1 = new JButton("회원가입");
		jb2 = new JButton("로그인");
		
		jp.add(jb1);
		jp.add(jb2);
		
		add(jp);
		
		setSize(500,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				// 익명 내부클래스에서는 
				// this를 사용할때 클래스.this를 사용해야 된다.
				new Ex03_Join(Ex03_Main.this);
				
			}
		});
		
	}
	public static void main(String[] args) {
		new Ex03_Main();
	}
}
