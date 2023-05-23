package day09.com.ict.edu;

public class Ex02_Array {
	public static void main(String[] args) {
		// 선언과 생성을 한번에 처리하자 
		// char[] k1 ;        // 선언
		// k1 = new char[4];  // 생성
		char[] k1 = new char[4];
		
		// 데이터 저장 
		k1[0] = 'J';
		k1[1] = 'A';
		k1[2] = 'V';
		k1[3] = 65 ;  // 0-65535 까지는 오류 없음
		
		// 하나씩 출력
		for (int i = 0; i < k1.length; i++) {
			System.out.println(k1[i]);
		}
		System.out.println("============");
		
		// 개선된 for문
		for (char k : k1) {
			System.out.println(k);
		}
		System.out.println("============");
		
		
		// 선언, 생성, 데이터 저장 한번에 
		char[] k2 = {'j', 'a', 'v', 'a', '0','1'};
		int[] k3 = {100,200,300,400};
		double[] k4 = {3.14, 7.25, 4, 6.12 ,'a'};
		String[] str = {"홍길동","이길동","고길동","박길동"};
		
		for (int i = 0; i < k4.length; i++) {
			System.out.println(k4[i]);
		}
		System.out.println("==================");
		
		for (String k : str) {
			System.out.println(k);
		}
		
	}
}













