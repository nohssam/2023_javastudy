package day21.com.ict.edu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex03_Join extends JFrame{
	Ex03_Main main;
	JPanel jp;
	JButton jb;
	public Ex03_Join(Ex03_Main main) {
		this.main = main;
		jp = new JPanel();
		jb = new JButton("뒤로가기");
		
		jp.add(jb);
		add(jp);
		
		setSize(500,300);
		setLocationRelativeTo(null);
		// setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				main.setVisible(true);
				setVisible(false);
			}
		});
	}
}
