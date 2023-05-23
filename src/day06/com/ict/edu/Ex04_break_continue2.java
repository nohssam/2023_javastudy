package day06.com.ict.edu;

public class Ex04_break_continue2 {
	public static void main(String[] args) {
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println( "i=" + i + ", j=" + j);
			}
		}
		System.out.println("==========break==============");
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i == 2 ) break;
				System.out.println( "i=" + i + ", j=" + j);
			}
		}
		System.out.println("==========break==============");
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j == 2 ) break;
				System.out.println( "i=" + i + ", j=" + j);
			}
		}
		System.out.println("==========continue-1==============");
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i == 2 ) continue;
				System.out.println( "i=" + i + ", j=" + j);
			}
		}
		System.out.println("==========continue-2==============");
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j == 2 ) continue;
				System.out.println( "i=" + i + ", j=" + j);
			}
		}
		System.out.println("========================");		
		
		
	}
}









