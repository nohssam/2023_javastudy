package day17.com.ict.edu2;

// 디버깅 : 논리적인 오류를 잡기 위해서 실행하는 행위, 해당 변수값을 조사 
//        알아서 수정하지 못한다.
//        개발 단계 중에 발생하는 시스템의 논리적인 오류나 비정상적인 연산(버그)
//        를 찾아 내고 그 원인을 밝히고 수정하는 작업과정을 말한다.

// breakpoint(중단점) : 디버깅 실행 시 자동으로 해당 위에서 실행이 중단되어  
//                     변수값을 조사할 수 있는 특정 지정을 말한다.

// F8 : 중단점에서 중단점으로 이동
// F5 : 한 문장씩 실행, 메서드를 만나면 안으로 진입 
// F6 : 한 문장씩 실행, 메서드를 만나면 건너 뛴다.
public class Ex01_debug {
	public static void main(String[] args) {
		int total = 0 ;
		for (int i = 1; i < 11; i++) {
			total = total + i;
			System.out.println("1부터 " + i + "까지의 합은 " + total +" 입니다.");
		}
		System.out.println("합 : " + total);
	}
}
