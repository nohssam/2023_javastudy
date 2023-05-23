package day18.com.ict.edu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex10_Map {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("이름", "홍길동");
		map.put("나이", "31");
		map.put("주소", "충청북도");
		map.put("성별", "남자");
		map.put("취미", "운동");
		
		for (String k : map.keySet()) {
			System.out.println(k + ":" + map.get(k));
		}
		System.out.println("================");
		
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String k = (String) it.next();
			System.out.println(k + ":" + map.get(k));
		}
		System.out.println("=================");
		
		HashMap<String, String> map2 = new HashMap<>();
		map.put("이름", "홍길동");
		map.put("나이", "31");
		map.put("주소", "충청북도");
		map.put("성별", "남자");
		map.put("취미", "운동");
		
	}
}









