package day13.com.ict.edu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Ex07_LocalDate {
	public static void main(String[] args) {
		// java version 8.0 이상만 가능
		// LocalDate : 날짜 정보만 필요할 때 
		// LocalTime : 시간 정보만 필요할 때
		// LocalDateTime : 날짜, 시간 모두 필요할 때 
		
		LocalDate cDate = LocalDate.now();
		System.out.println(cDate);
		
		LocalTime cTime = LocalTime.now();
		System.out.println(cTime);
		
		LocalDateTime cdt = LocalDateTime.now();
		System.out.println(cdt);
		System.out.println();
		
		System.out.println("--날짜--");
		System.out.println("getYear() : " + cDate.getYear());              // 년도
		System.out.println("getMonth() : " + cDate.getMonth());            // May
		System.out.println("getMonthValue() : " + cDate.getMonthValue());  // 월(1,2,3,...)
		System.out.println("getDayOfYear() : " + cDate.getDayOfYear());    // 년의 몇번째 일
		System.out.println("getDayOfMonth() : " + cDate.getDayOfMonth());  // 일 
		System.out.println("getDayOfWeek() : " + cDate.getDayOfWeek());    // 요일(MONDAY)
		System.out.println("isLeapYear() : 윤년여부 : " + cDate.isLeapYear());  // 
		System.out.println();
		
		System.out.println("-- 시간 --");
		System.out.println("getHour() : " + cTime.getHour());
		System.out.println("getMinute() : " + cTime.getMinute());
		System.out.println("getSecond() : " + cTime.getSecond());
		// 1970년 1월 1일 UTC의 첫 번째 순간 이후의 현재 시간까지의 나노초를 나타내는 값
		System.out.println("getNano() : " + cTime.getNano());
		System.out.println();
		
		System.out.println(cDate.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println(cDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		System.out.println(cdt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:SS")));
		System.out.println();
		
		System.out.println("-- 날짜 차이 계산 -- ");
		LocalDate sDate = LocalDate.now();
		LocalDate eDate = LocalDate.of(2023, 06, 15);
		Period period = Period.between(sDate, eDate);
		
		System.out.println(period.getYears());  // 년
		System.out.println(period.getMonths()); // 월
		System.out.println(period.getDays());   // 일
		System.out.println(ChronoUnit.DAYS.between(sDate, eDate));   // 일
		System.out.println();
		
		System.out.println(sDate.plusYears(2));
		System.out.println(sDate.plusMonths(2));
		System.out.println(sDate.plusDays(17));
		
		
		
	}
}














