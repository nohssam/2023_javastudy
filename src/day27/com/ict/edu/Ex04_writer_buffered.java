package day27.com.ict.edu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

// BufferedWriter : newLine() => 줄바꿈 기능
public class Ex04_writer_buffered {
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			String pathname = "D:/njm/ex02.txt";
			File file = new File(pathname);
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			// 내용
			// String msg = "안녕하세요\n123132\nHello";
			bw.write("안녕하세요");
		    bw.newLine();
		    bw.write("123456789");
		    bw.newLine();
		    bw.write("Hello");
		    
			bw.flush();
		} catch (Exception e) {
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (Exception e2) {
			}
		}
	}
}
