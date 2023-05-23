package day03.com.ict.edu2;

public class Test02 {
	public static void main(String[] args) {
		// 2시간 40분 30초 는 몇 초 일까요?
		int h = 2 * 60 * 60 ;  // 시간 => 초
		int m = 40 * 60;       // 분  => 초
		int s = 30 ;
		
		int result = h + m + s ;
		System.out.println("2시간40분30초는 " + result + "초 입니다.");
		
	}
}
