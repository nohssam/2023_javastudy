package day28.com.ict.edu;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// ObjectOutputSteram : 객체 출력 스트림
// writeObject() :  객체 직렬화 메서드
public class Ex03_ObjectOutputStream {
	public static void main(String[] args) {
		// 1. 객체 만들기 
		Ex03_VO vo1 = new Ex03_VO("고길동", 27, "서울 마포구", true, 179.5);
		Ex03_VO vo2 = new Ex03_VO("이길동", 21, "서울 용산구", false, 170.0);
		Ex03_VO vo3 = new Ex03_VO("김길동", 17, "서울 강남구", true, 183.3);
		Ex03_VO vo4 = new Ex03_VO("박길동", 33, "서울 서초구", false, 165.5);
		Ex03_VO vo5 = new Ex03_VO("홍길동", 26, "서울 중랑구", true, 173.5);
		
		// 2. 만들어진 객체를 컬렉션으로 모으자 
		ArrayList<Ex03_VO> list = new ArrayList<>();
		list.add(vo1);
		list.add(vo2);
		list.add(vo3);
		list.add(vo4);
		list.add(vo5);
		
		// 3. 모은 객체 들을 직렬화를 한 후에 파일에 저장한다.
		// 직렬화가 된 정보는 볼 수 없다.
		// 읽을 때 역직렬화를 해야 볼 수 있다.
		String pathname = "D:/njm/object01.ser";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
	
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			// 4.객체 직렬화
			oos.writeObject(list);
			oos.flush();
			
		} catch (Exception e) {
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
		
	}
}
