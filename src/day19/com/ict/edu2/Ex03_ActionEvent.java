package day19.com.ict.edu2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex03_ActionEvent extends JFrame{
	JPanel jp ;
	JButton jb1, jb2, jb3 ;
	public Ex03_ActionEvent() {
		super("ActionEvent");
		
		jp = new JPanel();
		jb1 = new JButton("입력1");
		jb2 = new JButton("입력2");
		jb3 = new JButton("EXIT");
		
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		
		add(jp);
		
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		Dog dog = new Dog();
		jb1.addActionListener(dog);
		jb2.addActionListener(dog);
		jb3.addActionListener(dog);
	}
	
	// 내부클래스 : ActionListener를 가지고 있는 내부클래스 
	class Dog implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton obj = (JButton)e.getSource();
			if(obj == jb1) {
				System.out.println("입력1 눌렸네");
			}else if(obj == jb2) {
				System.out.println("입력2 눌렸네");
			}else if(obj == jb3) {
				System.exit(0);
			}
		}
	}
	
	public static void main(String[] args) {
		new Ex03_ActionEvent();
	}
}















