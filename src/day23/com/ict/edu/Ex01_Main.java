package day23.com.ict.edu;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Ex01_Main extends JFrame{
	Ex01_Canvas canvas = new Ex01_Canvas();
	public Ex01_Main() {
		super("키 이벤트로 이미지 움직이기");
		
		add(canvas);
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		// key 이벤트 
		/*
		addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
		});
		*/
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// 눌려진 키값을 구하지 
				int key = e.getKeyCode();
				switch (key) {
				case KeyEvent.VK_LEFT:
					if(canvas.x <= 0) {
						canvas.x = 0 ;
					}else {
						canvas.x = canvas.x - 10 ;
					}
					break;

				case KeyEvent.VK_RIGHT:
					if(canvas.x >= canvas.getWidth()-100) {
						canvas.x = canvas.getWidth()-100;
					}else {
					  canvas.x = canvas.x + 10 ;
					}
					break;
				}
				canvas.repaint();
			}
		});
	}
	public static void main(String[] args) {
		new Ex01_Main();
	}
}







