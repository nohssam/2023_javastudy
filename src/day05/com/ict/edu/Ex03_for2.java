package day05.com.ict.edu;

public class Ex03_for2 {
	public static void main(String[] args) {
		// 중첩 for 문 :  for문 안에 또 다른  for문이 존재하는
		
		for (int i = 1; i < 4; i++) {
			System.out.println("실행문 - 1");
			for (int j = 1; j < 6; j++) {
				System.out.println("i = " + i + ", j = " + j);
			} // 안쪽 for문 끝
			System.out.println("실행문 - 2");
		} // 바깥 for문 끝
		System.out.println("============================");
		
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i*j) );
			}
		}
		
		System.out.println("============================");
		
		for (int i = 2; i < 10; i++) {
			// System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + (i*j)+"  " );
			}
			System.out.println();
		}
		
		System.out.println("============================");
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + (j*i)+"  " );
			}
			System.out.println();
		}
		
		
	}
}









