package day19.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Ex04_ItemListener2 extends JFrame {
	JPanel jp1, jp2 ;
	JCheckBox jcb1, jcb2, jcb3, jcb4;
	JButton jb1, jb2;
	JTextArea jta;
	JScrollPane jsp;
	public Ex04_ItemListener2() {
		super("체크박스");
		jp1 = new JPanel();
		jcb1 = new JCheckBox();
		jcb1.setText("축구");
		jcb2 = new JCheckBox("야구");
		jcb3 = new JCheckBox("농구");
		jcb4 = new JCheckBox("배구");
		
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		jp1.add(jcb4);
		
		jta = new JTextArea(10,0);
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);
		
		jp2 = new JPanel();
		jb1 = new JButton("exit");
		jb2 = new JButton("clear");
		
		jp2.add(jb1);
		jp2.add(jb2);
		
		add(jp1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp2, BorderLayout.SOUTH);
		
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		// 체크박스에 ItemListener를 달자 
		jcb1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == e.SELECTED) {
					jta.append(jcb1.getText()+" 선택\n");
				}else if(e.getStateChange() == e.DESELECTED) {
					jta.append(jcb1.getText()+" 해제\n");
				}
			}
		});
		jcb2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == e.SELECTED) {
					jta.append(jcb2.getText()+" 선택\n");
				}else if(e.getStateChange() == e.DESELECTED) {
					jta.append(jcb2.getText()+" 해제\n");
				}
			}
		});
		jcb3.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == e.SELECTED) {
					jta.append(jcb3.getText()+" 선택\n");
				}else if(e.getStateChange() == e.DESELECTED) {
					jta.append(jcb3.getText()+" 해제\n");
				}
			}
		});
		jcb4.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == e.SELECTED) {
					jta.append(jcb4.getText()+" 선택\n");
				}else if(e.getStateChange() == e.DESELECTED) {
					jta.append(jcb4.getText()+" 해제\n");
				}
			}
		});
		
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// clear (초기화하자 )
				// 체그박스에 선택된것을 모두 지우자
				jcb1.setSelected(false);
				jcb2.setSelected(false);
				jcb3.setSelected(false);
				jcb4.setSelected(false);
				jta.setText("");
			}
		});
	}
	public static void main(String[] args) {
		new Ex04_ItemListener2();
	}

}
















