package day04.com.ict.edu;

public class Ex01_oper {
	public static void main(String[] args) {
		// 삼항 연산자 : 조건식 => 조건이 참 일때와 거짓 일때 를 구분해서 실행한다.
		// 형식) 자료형 변수이름 = (조건식) ? 조건식이 참일때 실행할 문장 : 조건식이 거짓일때 실행할 문장 ;
		// **주의사항)  변수,  참일때 실행 결과, 거짓일때 실행 결과  모두 같은 자료형이어야 한다. 
		//  조건식에는 boolean(true,false),  비교연산자,  논리연산자  
		
		String str = (false) ? "강아지"   :  "고양이" ;
		System.out.println("결과 : " + str);
		
		// int avg = 80 ;
		double avg = 55.3 ;
		str = (avg >= 60 ) ? "합격"  : "불합격"   ;
		System.out.println("결과 : " + str);
		
		char c1 = 'K';
		str = (c1>='a' && c1<='z') ? "소문자" : "소문자 아님" ;	
		System.out.println("결과 : " + str);
		
		// 1 또는 3 이면 남자 아니면 여자
		int gender = 1 ;
		str = (gender == 1 || gender == 3 )? "남자" : "여자" ;
		System.out.println("결과 : " + str);
		
		// 홀수이면 이면 남자,  짝수이면 여자 
		gender = 4;
		str = (gender % 2 == 1) ? "남자" : "여자" ;
		System.out.println("결과 : " + str);
		
		// 3의 배수인지 아니지 알아보자 
		int su1 = 33 ;
		str = (su1 % 3 == 0) ? "3의배수" : "3의 배수 아님";
		System.out.println("결과 : " + str);
		
		// 근무시간이 8시간까지는 시간당 9620이고 
		// 8시간을 초과한 시간 만큼은 1.5배 지급한다. 
		// 현재 근무한 시간이 10이다. 
		// 얼마를 받아야 하는가?
		
		int time = 10 ;
		int dan = 9620 ;
		
		int pay = (time > 8) ? (8 * dan) + (int)((time-8)*dan*1.5)  : time * dan;       
		System.out.println("결과 : " + pay);		
		
		int num1 = 47 ;
		int num2 = 32 ;
		int res = (num1 > num2) ? num1  : num2  ;
		System.out.println("큰값 : " + res);
		
		res = (num1 - num2 > 0) ? num1  : num2  ;
		System.out.println("큰값 : " + res);
		
		int res2 = Math.max(num1, num2);
		System.out.println("큰값 : " + res2);
		
		int res3 = -38 ;
		int res4 = (res3 >0 ) ? res3 : res3*-1  ;
		System.out.println("결과 : " + res4);
		
		int res5 = Math.abs(res3);
		System.out.println("결과 : " + res5);
	}
}












