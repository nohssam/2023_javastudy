package day14.com.ict.edu;

import java.util.Random;

public class Ex04_extends {
	public static void main(String[] args) {
		// Random 클래스 사용하기 
		Random ran = new Random();
		int su = ran.nextInt(10)+1; // 0-9 // 1-10
		System.out.println(su);
	}
}
