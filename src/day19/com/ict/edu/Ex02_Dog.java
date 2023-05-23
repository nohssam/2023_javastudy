package day19.com.ict.edu;

public class Ex02_Dog extends Thread{
//	public void start() {
//		for(int i=0; i<20; i++) {
//			System.out.println("멍~~~멍~~~~"+ Thread.currentThread().getName());
//		}
//	}
	@Override
	public void run() {
		for(; ; ){
			System.out.println("멍~~~멍~~~~"+Thread.currentThread().getName());
		}
	}
}
