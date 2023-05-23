package day13.com.ict.edu;

public class Ex03_static {
	// static 초기화
	// static{
	//  초기화 내용
	// } 
	
	int s1 = 100 ;
	private int p1 = 100 ;
	static int s2 ;
	
	public static int k1 = 100;
	static int k2 = 100;
	private static int k3 = 100; 
	
	static {
		m1 = 1000;
		m2 = 1000;
		s2 = 1000;
		k2 = 1000;
	}
	
	// 생성자 : 인스턴스 초기화가목적
	public Ex03_static() {
		s1 = 200;
		s2 = 400 ;
		s3 = 500 ;
	}
	int s3 ;
	static int m1 ;
	static int m2 = 500;
	
}






