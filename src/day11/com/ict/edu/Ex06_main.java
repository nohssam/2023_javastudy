package day11.com.ict.edu;

import java.util.Scanner;

public class Ex06_main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] sum = new int[5];
		double[] avg = new double[5];
		String[] hak = new String[5];
		
		Ex06_method ex06 = new Ex06_method();
		
		for (int i = 0; i < hak.length; i++) {
			System.out.print("이름 : ");
			name[i] = scan.next();
			
			System.out.print("국어 : ");
			kor[i] = scan.nextInt();
			
			System.out.print("영어 : ");
			eng[i] = scan.nextInt();
			
			System.out.print("수학 : ");
			math[i] = scan.nextInt();
			
			// 총점
			sum[i] = ex06.getSum(kor[i], eng[i], math[i]);
			
			// 평균
			avg[i] = ex06.getAvg(sum[i]);
			
			// 학점
			hak[i] = ex06.getHak(avg[i]);
		} 
		
		// 출력 
		for (int i = 0; i < hak.length; i++) {
			System.out.print(name[i]+"\t");
			System.out.print(sum[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.println(hak[i]);
		}
	}
}







