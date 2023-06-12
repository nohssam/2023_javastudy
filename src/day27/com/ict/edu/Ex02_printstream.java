package day27.com.ict.edu;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

// PrintStream은 모든 데이터 출력할 수 있음 
// 기본생성자가 없어서 BufferedStream 처럼 FileStream를 이용해야 한다.
public class Ex02_printstream {
	public static void main(String[] args) {
		String pathname = "D:/njm/test04.txt";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		try {
			// 체인방식
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos);
			
			ps.println('A');
			ps.print("안녕하세요");
			ps.print(97);
			ps.println(3.14);
			ps.print("Hello");
			
		} catch (Exception e) {
		} finally {
			try {
				ps.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
