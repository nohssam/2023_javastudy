package day07.com.ict.edu;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = scan.next();
		
		System.out.print("국어점수 : ");
		int kor = scan.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = scan.nextInt();
		
		System.out.print("수학점수 : ");
		int math = scan.nextInt();
		
		// 충점, 평균, 학점를 구하기 
		int sum = kor + eng + math ;
		double avg =  (int)(sum/3.0 * 10) / 10.0 ;
		
		String hak = "";
		if(avg >= 90) {
			hak = "A 학점";
		}else if(avg >= 80) {
			hak = "B 학점";
		}else if(avg >= 70) {
			hak = "C 학점";
		}else {
			hak = "F 학점";
		}
		
		System.out.println("이 름 : " + name);
		System.out.println("총 점 : " + sum);
		System.out.println("평 균 : " + avg);
		System.out.println("학 점 : " + hak);
		
		
		
		
		
		
	}
}
