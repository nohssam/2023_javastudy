package day13.com.ict.edu;

import java.util.Calendar;

public class Ex06_Calendar {
	public static void main(String[] args) {
		// Calendar 클래스 : new 예약어를 사용하지 않고 getInstance()를 사용하면 현재 PC 날짜와 시간으로 설정됨
		 Calendar now = Calendar.getInstance();
		 System.out.println(now);
		 System.out.println(now.getTime());
		 System.out.println(now.getTimeZone());
		 
		 System.out.println();
		 System.out.println(now.get(Calendar.YEAR) + "년");
		 System.out.println(now.get(Calendar.MONTH)+ 1 + "월");
		 System.out.println(now.get(Calendar.DATE) + "일");
		 System.out.println(now.get(Calendar.DAY_OF_MONTH) + "일");
		 System.out.println(now.get(Calendar.HOUR) + "시");         // 12 시간(오전/오후 필요)
		 System.out.println(now.get(Calendar.HOUR_OF_DAY) + "시");  // 24 시간
		 System.out.println(now.get(Calendar.MINUTE) + "분");
		 System.out.println(now.get(Calendar.SECOND) + "초");
		 System.out.println();
		 
		 
		 // AM=0 , PM=1  구하기
		 int res = now.get(Calendar.AM_PM);
		 if(res == 0) {
			 System.out.println("AM " + now.get(Calendar.HOUR) + "시");
		 }else if(res == 1) {
			 System.out.println("PM " + now.get(Calendar.HOUR) + "시"); 
		 }
		 
		 // 요일 (1(일요일)....7(토요일))
		 res = now.get(Calendar.DAY_OF_WEEK);
		 switch (res) {
			case 1: System.out.println("일요일"); break;
			case 2: System.out.println("월요일"); break;
			case 3: System.out.println("화요일"); break;
			case 4: System.out.println("수요일"); break;
			case 5: System.out.println("목요일"); break;
			case 6: System.out.println("금요일"); break;
			case 7: System.out.println("토요일"); break;
		}
		 // 날짜 변경 (month는 0부터)
		 now.set(2023, 3, 25);
		 System.out.println(now.getTime());
		 
		 now.add(Calendar.DATE, 13);
		 System.out.println(now.getTime());
	}
}













