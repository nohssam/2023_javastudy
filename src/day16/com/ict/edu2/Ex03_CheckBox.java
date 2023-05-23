package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex03_CheckBox extends JFrame{
	public Ex03_CheckBox() {
		super("체크박스");
		
		// 컨테이너
		JPanel jp = new JPanel();
		
		// 컴포넌트
		JCheckBox jcb1 = new JCheckBox();
		jcb1.setText("야구");
		jcb1.setSelected(true);
		
		JCheckBox jcb2 = new JCheckBox("축구", true);
		JCheckBox jcb3 = new JCheckBox("농구");
		JCheckBox jcb4 = new JCheckBox("배구");
		
		jp.add(jcb1);
		jp.add(jcb2);
		jp.add(jcb3);
		jp.add(jcb4);
		
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-250 , 300, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Ex03_CheckBox();
	}
}
