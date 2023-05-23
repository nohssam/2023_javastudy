package day18.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex01_Calc3 extends JFrame{
	public Ex01_Calc3() {
		super("계산기");
		
		JPanel jp1 = new JPanel();
		JTextField jtf1 = new JTextField(5);
		JTextField jtf2 = new JTextField(5);
		String[] items = {"선택하세요", " + ", " - ", " * ", " / "};
		JComboBox<String> jcb = new JComboBox<>(items);
		
		jp1.add(new JLabel("수 1 : "));
		jp1.add(jtf1);
		jp1.add(new JLabel("수 2 : "));
		jp1.add(jtf2);
		jp1.add(new JLabel("연산자 : "));
		jp1.add(jcb);
		
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true);
		jta.setEditable(false);
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JPanel jp2 = new JPanel();
		JButton jb1 = new JButton("계 산");
		JButton jb2 = new JButton("종 료");
		JButton jb3 = new JButton("취 소");
		
		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jb3);
		
		add(jp1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp2, BorderLayout.SOUTH);
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex01_Calc3();
	}
}
