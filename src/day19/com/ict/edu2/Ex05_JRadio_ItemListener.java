package day19.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Ex05_JRadio_ItemListener extends JFrame implements ActionListener, ItemListener{
	JPanel jp1, jp2;
	JRadioButton jrb1, jrb2, jrb3, jrb4;
	JTextArea jta;
	JButton exit, clear;
	ButtonGroup bg;
	public Ex05_JRadio_ItemListener() {
		super("라디오 버튼 이벤트");
		jp1 = new JPanel();
		jrb1 = new JRadioButton("  +  ");
		jrb2 = new JRadioButton("  -  ");
		jrb3 = new JRadioButton("  *  ");
		jrb4 = new JRadioButton("  /  ");
		
		jp1.add(jrb1);
		jp1.add(jrb2);
		jp1.add(jrb3);
		jp1.add(jrb4);
		
		bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		
		jta = new JTextArea(10,10);
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);
		
		jp2 = new JPanel();
		exit = new JButton("exit");
		clear = new JButton("clear");
		jp2.add(exit);
		jp2.add(clear);
		
		add(jp1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp2, BorderLayout.SOUTH);
		
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		jrb1.addItemListener(this);
		jrb2.addItemListener(this);
		jrb3.addItemListener(this);
		jrb4.addItemListener(this);
		
		exit.addActionListener(this);
		clear.addActionListener(this);
		
		
	}
	
	// 라디오 버튼 : 
	@Override
	public void itemStateChanged(ItemEvent e) {
		JRadioButton obj = (JRadioButton)e.getSource();
		if(e.getStateChange() == e.SELECTED) {
			jta.append(obj.getText()+" 선택\n");;
		}
	}
	
	// 버튼 처리
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton) e.getSource();
		if(obj == exit) {
			System.exit(0);
		}else if(obj == clear) {
			bg.clearSelection();
			jta.setText("");
		}
	}
	public static void main(String[] args) {
		new Ex05_JRadio_ItemListener();
	}
}






