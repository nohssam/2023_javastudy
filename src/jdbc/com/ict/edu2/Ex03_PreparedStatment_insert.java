package jdbc.com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex03_PreparedStatment_insert {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("custid : ");
		int custid = scan.nextInt();
		
		System.out.print("name : ");
		String name = scan.next();
		
		System.out.print("address : ");
		String address = scan.next();
		
		System.out.print("phone : ");
		String phone = scan.next();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		int result = 0 ;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user ="c##nohssam";
			String password ="1111";
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "insert into customer(custid, name, address, phone) values(?,?,?,?)" ;
			// ? => 바인딩변수 
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, custid);
			pstm.setString(2, name);
			pstm.setString(3, address);
			pstm.setString(4, phone);
			
			result = pstm.executeUpdate();
			if(result>0) {
				sql = "select * from customer";
				pstm = conn.prepareStatement(sql);
				rs = pstm.executeQuery();
				while(rs.next()) {
					System.out.print(rs.getString(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\n");
				}
			}
		} catch (Exception e) {
			System.out.println("삽입 실패");
		} finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
}
