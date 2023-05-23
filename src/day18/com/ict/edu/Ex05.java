package day18.com.ict.edu;

import java.util.TreeSet;

public class Ex05 {
	public static void main(String[] args) {
		// 로또 : 1 ~ 45, 랜덤, 중복안됨, 6자리
		TreeSet<Integer> lotto = new TreeSet<>();
		
		for (int i = 0; i < 6; i++) {
			int su = (int)(Math.random()*45)+1 ;
			// 안들어가지면 
			if(! lotto.add(su)) {
				i--;
			}
		}
		System.out.println(lotto);
	}
}
