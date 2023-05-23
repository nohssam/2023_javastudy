package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex02_Component extends JFrame{
	public Ex02_Component() {
		super("버튼 이벤트");
		JPanel jp = new JPanel();
		
		JButton jb1 = new JButton();
		jb1.setText("첫번째");
		
		JButton jb2 = new JButton("두번째");
		
		jp.add(jb1);
		jp.add(jb2);
		
		add(jp);
		
		// jb1.addActionListener(ActionListener i);
		// ActionListener => 인터페이스
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("첫번째 버튼 클릭");
			}
		});
		//setSize(300,400);
		//setLocation(x,y);
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		// setSize() + setLocation()
		setBounds(ds.width/2-150, ds.height/2-200, 300, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
	}
	public static void main(String[] args) {
		new Ex02_Component();
	}
}







