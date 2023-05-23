package day03.com.ict.edu;

public class Ex04_oper {
	public static void main(String[] args) {
		// 논리연산자 : &&(AND,논리곱),  ||(OR,논리합), !(NOT,논리부정)
		// 논리연산자의 연산 대상은  boolean 형
		// 결과는  boolean 형 , 조건식에 사용
		
		// AND = && = 논리곱 = 교집합
		// 주어진 조건들이 모두 true 일때만 결과는 true
		// false가 있으면 결과는 false
		// false 이후는 연산하지 않는다.
		// **AND 조건을 이용하면 범위를 지정할 수 있다.
		//  a>=10 && a<=20  => a는 10부터 20까지의 범위를 지정한 것   
		
		int su1 = 10 ;
		int su2 = 7 ;
		boolean result ;
		result = (su1 >= 7) && (su2 >= 5);
		System.out.println(result);
		
		result = (su1 <= 7) && (su2 >= 5);
		System.out.println(result);
		
		result = (su1 >= 7) && (su2 <= 5);
		System.out.println(result);
		
		result = (su1 <= 7) && (su2 <= 5);
		System.out.println(result);
		
		System.out.println("=========================");
		
		result = ((su1 = su1 +2) > su2 )  && (su1 == (su2 = su2 + 5 )) ;
		System.out.println("결과 : " + result);
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		
		System.out.println("=========================");
		su1 = 10 ;
		su2 = 7 ;
		
		result = ((su1 = su1 +2) < su2 )  && (su1 == (su2 = su2 + 5 )) ;
		System.out.println("결과 : " + result);
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		System.out.println("=========================");
		
		// 범위 지정
		int su3 = 34 ;
		//  su3은 20 ~ 30 사이에 존재하는 값이다.
		result =  su3>=20 && su3<=40 ;
		System.out.println(result);
		System.out.println("=========================");
		
		// char c1이 소문자이냐?
		char c1 = 'G';
		result = c1>='a' && c1<='z';
		System.out.println(result);
	}
}











