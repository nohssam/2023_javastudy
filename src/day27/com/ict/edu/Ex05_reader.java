package day27.com.ict.edu;

import java.io.File;
import java.io.FileReader;

// FileInputStream => 1byte, read() => 아스키코드(숫자), read(byte[] b)
// FileReader      => 2byte, read() => 유니코드(숫자), read(char[] b) 
public class Ex05_reader {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			String pathname = "D:/njm/ex01.txt";
			fr = new FileReader(pathname);
			
			// 한 글자 읽기
			// int k = fr.read();
			// System.out.println(k + " : " + (char)(k));
			
			// 전체 읽기
			// int k = 0 ;
			// while((k= fr.read()) != -1) {
			//   System.out.println(k + " : " + (char)(k));
			// }
			
			// 배열 처리
			// File file = new File(pathname);
			// char[] c = new char[(int)file.length()];
			// c 배열에 모든 정보 저장됨
			// fr.read(c);
			// for (char k : c) {
			// 	 System.out.println(k + " : " + (char)(k));
			//  }
			
			// String 이용
			File file = new File(pathname);
			char[] c = new char[(int)file.length()];
			fr.read(c);
			String msg = new String(c).trim();
			System.out.println(msg);
			
		} catch (Exception e) {
		} finally {
			try {
				fr.close();
			} catch (Exception e2) {
			}
		}
	}
}











