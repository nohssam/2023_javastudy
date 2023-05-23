package day14.com.ict.edu;

import java.util.Random;

public class Ex06_extends extends Random{
	int su = nextInt();
	public Ex06_extends() {
		System.out.println("Ex06 :" + su);
	}
	public static void main(String[] args) {
		Ex06_extends test = new Ex06_extends();
	}
}
