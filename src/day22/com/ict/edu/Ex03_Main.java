package day22.com.ict.edu;

import javax.swing.JFrame;

public class Ex03_Main extends JFrame {
	public Ex03_Main() {
		super("Canvas");
		
		add(new Ex03_Canvas());
		setSize(1000, 800);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Ex03_Main();
	}
}
