package jdbc.com.ict.edu4;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("선택하세요");
		System.out.println("1. 테이블 전체 데이터 보기 ");
		System.out.println("2. 테이블 특정 데이터 보기 ");
		System.out.println("3. 데이터 삽입 ");
		System.out.println("4. 데이터 삭제 ");
		System.out.println("5. 데이터 수정 ");
		System.out.println(" >>>>>>>>> ");
		
		int menu = scan.nextInt();
		switch (menu) {
		case 1: 
			 ArrayList<VO>  list =DAO.getInstance().getSelectAll(); 
			 for (VO k : list) {
				System.out.print(k.get고객아이디()+"\t");
				System.out.print(k.get고객이름()+"\t");
				System.out.print(k.get나이()+"\t");
				System.out.print(k.get등급()+"\t");
				System.out.print(k.get직업()+"\t");
				System.out.print(k.get적립금()+"\n");
			}
			 break;
		case 2:
			System.out.print("고객아이디 : ");
			String c_id = scan.next();
			VO vo = DAO.getInstance().getSelectOne(c_id);
			if(vo.get고객아이디() != null) {
				System.out.print(vo.get고객아이디()+"\t");
				System.out.print(vo.get고객이름()+"\t");
				System.out.print(vo.get나이()+"\t");
				System.out.print(vo.get등급()+"\t");
				System.out.print(vo.get직업()+"\t");
				System.out.print(vo.get적립금()+"\n");
			}else {
				System.out.println("아이디가 존재하지 않습니다.");
			}
			break;
		case 3 : 
			VO vo2 = new VO();
			System.out.println("삽입할 정보를 입력하세요");
			System.out.print("고객아이디 : ");
			vo2.set고객아이디(scan.next());
			System.out.print("고객이름 : ");
			vo2.set고객이름(scan.next());
			System.out.print("나이 : ");
			vo2.set나이(scan.next());
			System.out.print("등급 : ");
			vo2.set등급(scan.next());
			System.out.print("직업 : ");
			vo2.set직업(scan.next());
			System.out.print("적립금 : ");
			vo2.set적립금(scan.next());;
			
			int result = DAO.getInstance().getInsert(vo2);
			if(result>0) {
				ArrayList<VO>  list2 =DAO.getInstance().getSelectAll(); 
				 for (VO k : list2) {
					System.out.print(k.get고객아이디()+"\t");
					System.out.print(k.get고객이름()+"\t");
					System.out.print(k.get나이()+"\t");
					System.out.print(k.get등급()+"\t");
					System.out.print(k.get직업()+"\t");
					System.out.print(k.get적립금()+"\n");
				}
			}else {
				System.out.println("삽입실패");
			}
			break;
			
		case 4:
			VO vo3 = new VO();
			System.out.println("삭제할 고객아이디 : ");
			vo3.set고객아이디(scan.next());
			int result2 = DAO.getInstance().getDelete(vo3);
			if(result2>0) {
				ArrayList<VO>  list3 =DAO.getInstance().getSelectAll(); 
				 for (VO k : list3) {
					System.out.print(k.get고객아이디()+"\t");
					System.out.print(k.get고객이름()+"\t");
					System.out.print(k.get나이()+"\t");
					System.out.print(k.get등급()+"\t");
					System.out.print(k.get직업()+"\t");
					System.out.print(k.get적립금()+"\n");
				}
			}else {
				System.out.println("삭제실패");
			}
			break;
		}
	}
}















