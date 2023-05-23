package day03.com.ict.edu2;

public class Test03 {
	public static void main(String[] args) {
		// 3989초는 몇시간, 몇분, 몇초 인가?
		int time = 3989 ;
		int h = 0 ;    // 시
		int m = 0 ;    // 분
		int s = 0 ;    // 초
		int res = 0 ;  // 나머지
		
		h = time / (60*60) ;     // 1   
		res = time % (60*60) ;   // 389
		
		m = res / 60 ;   // 분
		s = res % 60 ;   // 초
		
		
	}
}
