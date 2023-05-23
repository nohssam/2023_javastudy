package day14.com.ict.edu5;

public class Ex02_Cat extends Ex02_Animal{
	 String color = "삼색";
	
	@Override
	public void sound() {
		System.out.println("야옹~ 야옹~");
	}
	public void play() {
		System.out.println("타워에서 잠자기 ");
	}
}
