package day18.com.ict.edu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Ex07_List {
	// List 인터페이스 : 배열과 흡사한 구조
	//                삽입, 삭제, 추가가 자유롭다.
	//                크기를 미리 지정하지 않아도 된다.
	// List 인터페이스를 구현한 클래스 : Stack, ArrayList, Vector;
	// ArrayList : 멀티스레드 동기화 지원 안함
	// Vector : 멀티스레드 동기화 지원 함
	// ArrayList 와 Vector 사용법은 같다.
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Vector<String> vector = new Vector<>();
		
		list.add("손흥민");
		list.add("이강인");
		list.add("김민재");
		list.add("손흥민"); // 중복가능
		
		vector.add("손흥민");
		vector.add("이강인");
		vector.add("김민재");
		vector.add("손흥민"); // 중복가능
		
		list.add(1,"차범근");    // 삽입
		vector.add(1,"차범근");  // 삽입
		
		System.out.println(list);
		System.out.println();
		System.out.println(vector);
		System.out.println();
		
		// 검색 : search(), elementAt(), firstElement(), lastElement() : list는없음
		
		// indexOf()
		if(list.contains("손흥민")) {
			System.out.println(list.indexOf("손흥민"));
			System.out.println(list.lastIndexOf("손흥민"));
			
			// 치환
			//list.set(list.lastIndexOf("손흥민"), "박지성");
		}
		System.out.println(list);
		
       // elementAt(), firstElement(), lastElement() : vector에는 있음
		if(vector.contains("손흥민")) {
			System.out.println(vector.indexOf("손흥민"));
			System.out.println(vector.lastIndexOf("손흥민"));
			// 치환
			//vector.set(vector.lastIndexOf("손흥민"), "차두리");
			System.out.println(vector.firstElement());
			System.out.println(vector.lastElement());
		}
		System.out.println(vector);
		
		// 삭제 ; remove 
		list.remove("손흥민");
		vector.remove("손흥민");
		System.out.println(list);
		System.out.println(vector);
		
		// 출력 : 개선된 for문 , iterator
		for (String k : vector) {
			System.out.println(k+" 골");
		}
		
		Iterator<String> it =  list.iterator();
		while (it.hasNext()) {
			String k = (String) it.next();
			System.out.println(k +"킥");
		}
	}
}














