package day15.com.ict.edu3;

// 인터페이스 상속 
// 1. 자식클래스가 일반 클래스인 경우 반드시 오버라이딩 해야 된다. (implements)
class Ex01_extends implements Ex01_interface{

	@Override
	public void sound() {
		System.out.println("음악듣기");
	}

	@Override
	public void play() {
		System.out.println("게임하기");
	}
}
// 2. 자식클래스를 추상클래스로 만들면 오버라이딩을 할 필요가 없다.(implements)
//    객체 생성 시 조심 ( 부모클래스의 추상메서드를 구현하지 않았음)
//    보통은 다른 클래스가 해당 클래스를 부모클래스로 만들어서 
//    사용한다. 
 abstract class Ex01_extends2 implements Ex01_interface{
	String name = "홍길동";
	public void tour() {
		System.out.println("여행하다.");
	}
}
// 3. 자식클래스를  인터페이스로 만들면 오버라이딩을 할 필요가 없다.(extends) 
interface Ex01_extends3 extends Ex01_interface{
	
}

// Ex01_extends2 추상클래스를 일반 클래스가 상속받자
class Ex01_extends4 extends Ex01_extends2{
	@Override
	public void sound() {
		System.out.println("사운드를 듣다.");
	}
	@Override
	public void play() {
		System.out.println("플레이를 하다.");
	}
	
}










