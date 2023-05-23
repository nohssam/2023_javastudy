package day11.com.ict.edu;

public class Ex01_main {	
	public static void main(String[] args) {
		// static 객체 생성과 상관없이 호출 가능
		// static 호출 : 클래스이름.변수, 클래스이름.메서드
		System.out.println(Ex01_method.ki);
		
		Ex01_method.getAvg();
		System.out.println(Ex01_method.ki);
		System.out.println("==================");
		
		Ex01_method t1 = new Ex01_method();
		
		// 인스턴스 호출 방법 ; 참조변수.변수,  참조변수.메서드
		String n = t1.name ;
		
		// void는 호출한곳으로 아무것도 가져오지 않는다.
		t1.getTotal();
		
		// total 변경 된 것을 확인 
		int k1 =t1.total;
		
		System.out.println(n);
		System.out.println(k1);
		System.out.println("============");
		
		
		double k2 = Ex01_method.getAvg2();
		System.out.println(k2);
	}
}





































