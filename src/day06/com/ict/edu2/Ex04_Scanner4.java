package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex04_Scanner4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("원하는 반복 횟수 : ");
		int su = scan.nextInt();
		
		System.out.print("원하는 단어 : ");
		String str = scan.next();
		
//		
//		for (int i = 0; i < su; i++) {
//			System.out.println(str);
//		}
//
		int i = 0 ;
		while (i<su) {
			System.out.println(str);
			i++;
		}
		
	}
}
