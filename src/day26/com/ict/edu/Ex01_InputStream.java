package day26.com.ict.edu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//바이트 입력 스트림 : InputStream 자식클래스 FileInputStream 사용
//				   FileInStream를 이용해서 해당파일에 내용을 1byte 읽기 
//		주요메서드 :  read() : int => 숫자(0-255, 아스키코드), 해당 숫자를 문자로 보려면  char 형 변환한다.
//                  더 이상 읽을 수 없으면 -1이 나온다.
//         			 ** 아스키코드(숫자,대문자,소문자, 일부 특수문자을 숫자와 1:1 매칭한 코드)
//					read(byte[] b) : 배열에 존재하는 아스키코드 읽기, 한글 깨짐
//                  close() : 입력 스트림 닫기

public class Ex01_InputStream {
	public static void main(String[] args) {
		String pathname = "D:/njm/test01.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			
			// 한 글자 읽기 (아스키코드 숫자값으로 나옴)
			// int res =   fis.read();
			// System.out.println(res + ":" + (char)(res));
			
			// 한 글자씩 해당 파일의 전체를 읽자 (한글, 한자 깨짐)
			// -1 나올 때까지 무한 루프
			
			// int res = 0 ;
			// while(true) {
			//	  res = fis.read();
			//	  if(res == -1) break;
			//	  System.out.println(res + " : " + (char)(res));
			// }
			
			// ** 이미지, 동영상.. 읽을 때 무조건 사용
			// int res = 0;
			// while((res = fis.read()) != -1) {
			//	  System.out.println(res + " : " + (char)(res));
			// }
			
			// 2. 배열이용 :  한글, 한자 깨짐
			// byte[] b = new byte[(int) file.length()];
			// 해당 파일 내용이 배열 b에 들어간다.
			// fis.read(b);
			// for (byte k : b) {
			//	 System.out.println(k + " : " + (char)(k));
			// }
			
			// ** 3. String 클래스 생성자 이용 : 한글 한자 안깨짐 
			 byte[] b = new byte[(int) file.length()];
			 fis.read(b);
			 String msg = new String(b);
			 System.out.println(msg);
			 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (Exception e2) {
			}
		}
	}
}



















