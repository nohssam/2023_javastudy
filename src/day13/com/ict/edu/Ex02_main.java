package day13.com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		
		System.out.println(Ex02_static.su2);
		System.out.println();
		
		Ex02_static p1 = new Ex02_static();
		System.out.println(p1.su1);
		System.out.println(p1.su2);
		System.out.println();
		
		Ex02_static p2 = new Ex02_static();
		System.out.println(p2.su1);
		System.out.println(p2.su2);
		System.out.println();
		
		Ex02_static p3 = new Ex02_static();
		System.out.println(p3.su1);
		System.out.println(p3.su2);
		System.out.println();
		
		System.out.println(p1.su1);
		System.out.println(p1.su2);
	}
}
