package day22.com.ict.edu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Ex01_JProgressBar extends JFrame{
	JPanel jp;
	JButton jb;
	JProgressBar jp1, jp2;
	public Ex01_JProgressBar() {
		super("프로그레스바 스레드");
		jp = new JPanel();
		jb = new JButton("start");
		jp1 = new JProgressBar();
		jp2 = new JProgressBar();
		jp.add(jb);
		jp.add(jp1);
		jp.add(jp2);
		add(jp);
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 단일 스레드 처리 
//		jb.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// 프로그레스바의 값
//				int cnt1 = 0 ;
//				int cnt2 = 0 ;
//				while (cnt1<= jp1.getMaximum() || cnt2 <=jp2.getMaximum()) {
//					cnt1 = cnt1 + 1;
//					cnt2 = cnt2 + 1;
//					jp1.setValue(cnt1);
//					jp2.setValue(cnt2);
//				}
// 			}
//		});
		
		// 멀티 스레드
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable() {
					@Override
					public void run() {
						int cnt = 0 ;
						while(cnt < jp1.getMaximum()) {
							cnt = cnt + (int)(Math.random()*10) ;
							jp1.setValue(cnt);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						System.out.println("1번도착");
					}
				}).start();
				new Thread(new Runnable() {
					@Override
					public void run() {
						int cnt = 0;
						while(cnt < jp2.getMaximum()) {
							cnt = cnt + (int)(Math.random()*10) ;
							jp2.setValue(cnt);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						System.out.println("2번도착");
					}
				}).start();
			}
		});
	}
	public static void main(String[] args) {
		new Ex01_JProgressBar();
	}
}
















