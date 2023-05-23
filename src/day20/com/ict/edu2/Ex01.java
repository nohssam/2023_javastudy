package day20.com.ict.edu2;

// 5. 두개의 스레드를 생성하여 첫번째 스레드의 출력을 1-100까지 출력하고,
//    두번째 스레드가 출력을 101-200까지 출력하라 (반드시 synchronized 사용)     
public class Ex01 implements Runnable{
	int x = 0;
//	
//	@Override
//	public synchronized void run() {
//		for (int i = 0; i < 100; i++) {
//			System.out.println(Thread.currentThread().getName() +" : " + ++x);
//		}
//	}
//	
	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				System.out.println(Thread.currentThread().getName() +" : " + ++x);
			}
		}
	}
	
	public static void main(String[] args) {
		Ex01 test = new Ex01();
		new Thread(test, "tiger").start();
		new Thread(test, "dog").start();
	}
}
