package day15.com.ict.edu5;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 컴포넌트 : 특정기능 또는 관련된 기능을 제고하는 하나의 객체
//          화면을 구성하는 객체 (예)레이블, 콤보박스, 리스트, 라디오버튼, 체크박스, 컨테이너

// 컨테이너 : 자기영역에 컴포넌트를 포함시키고,관리하는 역할을 하며, 다른 컨테이너를 포함 시킬 수 도 있는 객체
//          패널, 다이얼로그, 프레임 , 스크롤페인,

// 프레임 : 하나의 창

// 일반적인 창의 구조 :  창 (프레임 =컨테이너) | 패널(컨테이너) | 컴포넌트 
public class Ex03_Swing extends JFrame{
	public Ex03_Swing() {
		super("버튼 컴포넌트");
		
		// JPanel : 컨테이너의 한 종류, 컴퓨턴트를 묶어서 관리하는 클래스
		//          컴포넌트를 추가할 때 add() 사용
		//          나중에  JPanel은 JFrame에 추가해댜 된다. (add() 사용)
		JPanel jp = new JPanel();
		
		
		// 화면을 구성하는 컴포넌트 (버튼)
		JButton jb1 = new JButton("첫번째");
		JButton jb2 = new JButton();
		jb2.setText("두번째");
		
		jp.add(jb1);
		jp.add(jb2);
		
		add(jp);
		
		// 창 크기
		// setSize(300, 300);
		// 창 위치
		// setLocation(0, 0);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		
		setVisible(true);
		// 실제 프로그램 종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 창 크기 조절 불가
		setResizable(false);
		
		
	}
	public static void main(String[] args) {
		new Ex03_Swing();
	}
}











