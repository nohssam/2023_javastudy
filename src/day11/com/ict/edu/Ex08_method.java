package day11.com.ict.edu;

// 배열은 같은 자료형을 여러개 저장할 수 있지만 
// 클래스를 이용하면 자료형이 다르더라도 여러개 저장할 수 있다.
public class Ex08_method {
 
	// 단점은 멤버필드에 바로 접근 할 수 있다.
	// 해결책 : 접근제한자를 private으로 지정 (직접 접근을 못한다.) 
	//        변경하는 메서드(setter())와 데이터를 return 하는 메서드(getter())를 만들어 사용 
	String name = "";
	int kor = 0 ;
	int eng = 0 ;
	int math = 0 ;
	int sum = 0 ;
	double avg = 0.0;
	String hak = "";
	int rank = 0 ;
	
}
