package day05.com.ict.edu;

public class Ex01_switch {
	public static void main(String[] args) {
		/* switch ~ casse : 다중  if~else 문과 같은 조건문
		   if문의 조건식은 boolean,  비교연산, 논리연산 즉 true, false 일때 사용
		   switch문  int, char, String  일때 사용 (long, float, double 은 사용불가)
		   형식) switch( 인자값 = int, char, String){
		          case 조건값1 :  인자값과  조건값1이 같을 때 수행할 문장  ;  break;
		          case 조건값2 :  인자값과  조건값2이 같을 때 수행할 문장  ;  
		                        인자값과  조건값2이 같을 때 수행할 문장  ; break;   
				  case 조건값3 :  인자값과  조건값3이 같을 때 수행할 문장  ;  break;
				  default : 조건값1,2,3 모두 같지 않을 때 (나머지) 수행할 문장 ; break;
			
			** 주의사항 : break가 없으면  break를 만날때 까지 모든 실행문을 실행한다.
			   break 의 역할은  실행중인 범위({ } 블록)를 벗어나는 역할을 한다.
			   default는 생략 가능 한다.
		 */
		
		// int k1이 1이면 카페모카, 2이면  카페라떼, 3이면 아메리카노, 4이면 과일쥬스 를 출력하자 
		int k1 = 3 ;
		String res = "";
		switch (k1) {
			case 1: res = "카페모카"; break;
			case 2: res = "카페라떼"; break;
			case 3: res = "아메리카노"; break;
			case 4: res = "과일쥬스"; break;
		}
		System.out.println("결과 : " + res);
		System.out.println("===================");
		
		// break가 없을 때 : 다음 break를 만날때까지 다음 수행을 실행한다.
		int k2 = 1 ;
		switch (k2) {
			case 1: System.out.println("결과 : 카페모카");
			case 2: System.out.println("결과 : 카페라떼");
			case 3: System.out.println("결과 : 아메리카노");
			case 4: System.out.println("결과 : 과일쥬스");
		}
		System.out.println("===================");
		
		// char k3이 A, a ,1 이면 아프리카, B, b, 2이면 브라질, C, c, 3이면 캐나다 나머지 한국
		char k3 = 'k';
		switch (k3) {
			case 'A': 
			case 'a':
			case '1':	res = "아프리카"; break;
			case 'B': 
			case 'b': 
			case '2':	res = "브라질"; break;
			case 'C': 
			case 'c': 
			case '3':res = "캐나다"; break;
			default : res ="한국"; break;
		}
		System.out.println("결과 : " + res);
		System.out.println("===================");
		
		// String k4가 한국이면 서울, 중국이면 베이징, 일본이면 도쿄 을 출력하는 코딩
		 String k4 = "중국";
		 switch (k4) {
		 	case "한국":  res = "서울"; break;
		 	case "중국":  res = "베이징"; break;
		 	case "일본":  res = "도쿄"; break;
		}
		
		System.out.println("결과 : " + res);
		System.out.println("===================");
		
		// int k5가 3~5 : 봄,  6~8 : 여름,  9~11 : 가을,  12,1,2 : 겨울 출력하는 코딩
		int k5 = 2 ;
		switch (k5) {
			case 12:
			case 1:
			case 2:  res = "겨울" ; break;	
			case 3:
			case 4:
			case 5:  res = "봄" ; break;
			case 6:
			case 7:
			case 8:  res = "여름" ; break;	
			case 9:
			case 10:
			case 11:  res = "가을" ; break;
		}
		System.out.println("결과 : " + res);
		System.out.println("===================");
		
		// switch에서 범위가 넓어지면 사용하지 말자 (if문 사용하자)
		// int k6의 점수가 90이상이면 A학점, 80이상이면 B학점, 70이상이면 C학점, 나머지 F학점
		int k6 = 87 ;
		/*
		switch (k6) {
			case 100:
			case 99:
			 ****
			case 90: res = "A학점"; break;
			case 89: 
			  ****
			case 80: res = "B학점"; break;
		}
		*/
		
		switch ((int)(k6/10)) {
			case 10:
			case 9: res = "A학점"; break;
			case 8: res = "B학점"; break;
			case 7: res = "C학점"; break;
			default: res = "F학점";
		}
		System.out.println("결과 : " + res);
		System.out.println("===================");
	}
}












