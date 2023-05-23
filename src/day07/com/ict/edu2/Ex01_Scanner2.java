package day07.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner2 {
	public static void main(String[] args) {
		// Ex01_Scanner 클래스는 계속할까요? 질문했을 때 2이면 탈출하지만
		// 2를 제외한 나머지는 무조건 다시 실행 하게 되는 단점이 있다.

		Scanner scan = new Scanner(System.in);
		// 전체횟수, 짝수횟수, 짝수가 나온 퍼센트 구하기 (소숫점 첫째짜리까지 구하자)
		int count = 0;
		int even = 0;

		esc:
		while (true) {
			count++;
			System.out.print("숫자입력 : ");
			int su = scan.nextInt();
			String str = "";
			if (su % 2 == 0) {
				str = "짝수";
				even++;
			} else {
				str = "홀수";
			}
			System.out.println(su + "는 " + str + " 입니다.");
			
			while(true) {
				System.out.print("계속할까요?(1.yes,  2.no) >> ");
				int s1 = scan.nextInt();
				if (s1 == 1) {
					continue esc;
				}else if(s1 == 2) {
					break esc;
				}else {
					System.out.println("제대로 입력하세요");
					continue;
				}
					
			}
		}
		double per = (even / (count * 1.0)) * 100;
		System.out.println("전체 개수 : " + count);
		System.out.println("짝수 개수 : " + even);
		System.out.println("퍼센트 : " + (int) (per * 10) / 10.0 + "%");
	}
}
