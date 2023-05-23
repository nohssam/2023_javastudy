package day15.com.ict.edu5;

import javax.swing.JFrame;

public class Ex02_Swing extends JFrame{
	
	public Ex02_Swing() {
		super("Swing으로 만든 창");
		setSize(300, 300);
		setLocation(500, 500);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// Ex02_Swing test = new Ex02_Swing();
		new Ex02_Swing();
	}
}
