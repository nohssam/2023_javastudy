package day17.com.ict.edu3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex04_Layout extends JFrame{
	public Ex04_Layout() {
		super("JPanal를 BorderLay 변경");
		
		// 아무것도 하지 않으면 자동으로 FlowLayout이다.
		// JPanel jp = new JPanel();
		
		// JPanel를 BorderLayout 으로 변경하자. 
		// 방법1)
		// JPanel jp = new JPanel(new BorderLayout());
		
		// 방법2)
		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout());
		
		JButton jb1 = new JButton("버튼1");
		JButton jb2 = new JButton("버튼2");
		JButton jb3 = new JButton("버튼3");
		JButton jb4 = new JButton("버튼4");
		JButton jb5 = new JButton("버튼5");
		JButton jb6 = new JButton("버튼6");
		JButton jb7 = new JButton("버튼7");
		JButton jb8 = new JButton("버튼8");
		
		jp.add(jb1,BorderLayout.NORTH);
		jp.add(jb2,BorderLayout.CENTER);
		jp.add(jb3,BorderLayout.SOUTH);
		jp.add(jb4,BorderLayout.WEST);
		jp.add(jb5,BorderLayout.EAST);
		
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex04_Layout();
	}
}
