package jdbc.com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex02_PreparedStatment_select {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		int result = 0 ;
		Scanner scan = new Scanner(System.in);
		System.out.print("custid : ");
		int custid = scan.nextInt();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user ="c##nohssam";
			String password ="1111";
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "select * from customer where custid = ?" ;
			// ? => 바인딩변수 
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, custid);
			rs = pstm.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\n");
			}
			
		} catch (Exception e) {
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
