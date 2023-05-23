package day17.com.ict.edu3;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 화면 배치 종류
// 1. FlowLayout : 화면 상단 가운데 정렬 (JPanel)
// 2. BorderLayout : 동,서,남,북,가운데 배치
//                   방향표시를 하지 않으면 마지막 컴포넌트가 화면을 채운다. (JFrame)
// 3. GridLayout : 격자형태(행과 열)
// 4. BoxLayout  : 하나의 행, 하나의 열로 만든다.
// 5. CardLayout : 여러장의 카드를 쌓아두고 하나씩 보여주는 형태
// 6. 절대좌표     : 컴포넌트마다 좌표를 직정 지정해서 배치힌다.

public class Ex02_Layout extends JFrame{
	public Ex02_Layout() {
		super("FlowLayout");
		// 아무것도 하지 않으면 자동으로 FlowLayout이다.
		JPanel jp = new JPanel();
		
		JButton jb1 = new JButton("버튼1");
		JButton jb2 = new JButton("버튼2");
		JButton jb3 = new JButton("버튼3");
		JButton jb4 = new JButton("버튼4");
		JButton jb5 = new JButton("버튼5");
		JButton jb6 = new JButton("버튼6");
		JButton jb7 = new JButton("버튼7");
		JButton jb8 = new JButton("버튼8");
		
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jb6);
		jp.add(jb7);
		jp.add(jb8);
		
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex02_Layout();
	}
}
