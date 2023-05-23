package day16.com.ict.edu2;

import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class Ex10_Green extends JPanel{
	public Ex10_Green() {
		setBackground(Color.GREEN);
		
		JCheckBox jcb1 = new JCheckBox(" + ");
		JCheckBox jcb2 = new JCheckBox(" - ");
		JCheckBox jcb3 = new JCheckBox(" * ");
		JCheckBox jcb4 = new JCheckBox(" / ");
		
		add(jcb1);
		add(jcb2);
		add(jcb3);
		add(jcb4);
	}
}
