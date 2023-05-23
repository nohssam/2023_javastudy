package day13.com.ict.edu;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex05_date {
	public static void main(String[] args) {
		// 날짜 관련 클래스
		// 1. Date 클래스, 2. Calendar클래스, 3. LocalDate 클래스
		
		// 1. Date 클래스 : 기본생성자로 생성하면 컴퓨터의 시간으로 설정된다.
		//    Deprecated.  = 언제든지 지원을 하지 않을 수 있으니 다른 것 사용 하세요            
		Date date = new Date();
		System.out.println(date);
		
		// 2. 기본 형태로 변환하기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
		System.out.println(sdf.format(date));
		
		System.out.println(date.getYear() + 1900 + "년");   
		System.out.println(date.getMonth()+1+ "월");
		System.out.println(date.getDate()+ "일");
		System.out.println(date.getHours()+ "시");
		System.out.println(date.getMinutes()+ "분");
		System.out.println(date.getSeconds()+ "초");
		
		// 0-6,  0=>일요일, 6=>토요일
		int k =  date.getDay();
		switch (k) {
		case 0: System.out.println("일요일"); break;
		case 1: System.out.println("월요일"); break;
		case 2: System.out.println("화요일"); break;
		case 3: System.out.println("수요일"); break;
		case 4: System.out.println("목요일"); break;
		case 5: System.out.println("금요일"); break;
		case 6: System.out.println("토요일"); break;
			
		}
	}
}














