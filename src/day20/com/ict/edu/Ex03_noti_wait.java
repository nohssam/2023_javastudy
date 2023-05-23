package day20.com.ict.edu;

public class Ex03_noti_wait {
	public static void main(String[] args) {
		Ex03 test = new Ex03();
		new Thread(test,"dog").start();
		new Thread(test,"cat").start();
		new Thread(test,"tiger").start();
		new Thread(test,"lion").start();
	}
}
