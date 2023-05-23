package day20.com.ict.edu2;

// 6. 두 개의 스레드를 생성하여 첫번재 스레드의 출력을 1-50까지 출력하고,
//    두번째 스레드의 출력은 51-100까지 출력,
//    다시 첫번째 스레드가 101-150까지 출력, 두번째 스렉드가 151-200 출력
//    (synchronized , wait, notify) 
public class Ex02 implements Runnable{
	int x = 0 ;
	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+ ":" + ++x);
			if(x % 50 == 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				notify();
			}
		}
	}
	public static void main(String[] args) {
		Ex02 test = new Ex02();
		new Thread(test, "tiger").start();
		new Thread(test, "dog").start();
	}
}
