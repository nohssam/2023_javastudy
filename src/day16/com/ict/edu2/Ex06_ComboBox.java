package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex06_ComboBox extends JFrame{
	public Ex06_ComboBox() {
		super("콤보박스");
		
		JPanel jp = new JPanel();
		
		// 콤보박스에 들어갈 내용을 배열로 만든다.
		String[] items = {"좋아하는운동", "야구", "축구", "배구", "농구"};
		
		JComboBox<String> jcom = new JComboBox<>(items);
		
		// 특정항목을 먼저 나오게 하는 방법
		// jcom.setSelectedIndex(3);
		
		jp.add(jcom);
		
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-300, 500,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex06_ComboBox();
	}
}
