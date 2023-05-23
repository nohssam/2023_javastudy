package day15.com.ict.edu2;

public abstract class Ex04_abstract {
	String name = "홍길동";
	
	public abstract void sound();
	
	public void play() {
		System.out.println("산에서 놀기");
	}
	
	// public abstract String getName() ;
	
	public String getName() {
		return name;
	}
}
