package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex06_File_open extends JFrame{
	JPanel jp ;
	JTextField jtf;
	JButton jb;
	JTextArea jta;
	JScrollPane jsp;
	public Ex06_File_open() {
		super("불러오기");
		
		jp = new JPanel();
		jtf = new JTextField(20);
		jb = new JButton("불러오기");
		jta = new JTextArea();
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		
		jp.add(new JLabel("파일경로 : "));
		jp.add(jtf);
		jp.add(jb);
		
		add(jp, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f_open();
			}
		});
		jtf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f_open();
			}
		});
		jtf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FileDialog fd = new FileDialog((Frame) getParent(), "불러오기", FileDialog.LOAD);
				fd.setVisible(true);
				String msg = fd.getDirectory()+fd.getFile();
				if(! msg.equals("nullnull")) {
					jtf.setText(msg);
					f_open();
				}
			}
		});
	}
	private void f_open() {
		String pathname = jtf.getText().trim();
		if(pathname.length() > 0) {
			File file = new File(pathname);
			FileInputStream fis = null;
			BufferedInputStream bis = null;
			try {
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				
				byte[] b = new byte[(int) file.length()];
				bis.read(b);
				String msg = new String(b).trim();
				jta.setText(msg);
			} catch (Exception e) {
			} finally {
				try {
					bis.close();
					fis.close();
				} catch (Exception e2) {
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Ex06_File_open();
	}
}








