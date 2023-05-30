package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// customer 테이블에서 박씨 성을 가진 사람을 모든 정보 검색하자.
public class Ex03_Statment_select {
	public static void main(String[] args) {
		// 오라클 접속해서 처리하는 클래스 3개
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##nohssam";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// customer 테이블에서 박씨 성을 가진 사람을 모든 정보 검색하자.
			String sql = "select * from customer where name like '박%' ";
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\n");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
