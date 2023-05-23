package day16.com.ict.edu;


// Local 내부클래스
public class Ex06_Local {
	String name = "둘리";
	public Ex06_Local() {
		System.out.println("외부생성자 : " + this);
	}
	public void sound() {
		String str = "호이~ 호이~";
		System.out.println(str);
	}
	
	public void play() {
		int age = 24 ;
		// 내부클래스
		 class Dog{
			 String addr = "서울 용산구";
			 
			 public Dog() {
				System.out.println("내부생성자 : " + this);
			}
			 public void prn() {
				 System.out.println(name);
				 System.out.println(age);
				 System.out.println(addr);
				 // System.out.println(str);
			 }// 내부클래스 메서드 끝
		 } // 내부클래스 끝
		 Dog dog = new Dog();
		 dog.prn();
	}// 외부 클래스멤버 메서드 끝
}
















