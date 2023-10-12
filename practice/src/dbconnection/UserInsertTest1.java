package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertTest1 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			//JDBC 드라이버 등록
			Class.forName("oracle.jdbc.Oracle");
			
			//연결하기 - getConnection(url, user, password)
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"c##mydb",
					"pwmydb");
			System.out.println("연결 성공!");		
			
			//매개변수화된 sql문 작성
			String sql = "INSERT INTO users(userid, username, userpassword, userage, useremail)"
					+ "VALUES (?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "cloud");
			pstmt.setString(2, "박구름");
			pstmt.setString(3, "pw123");
			pstmt.setString(4, "24");
			pstmt.setString(5, "cloud@cloud.com");
			
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행의 수: " + rows);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
					System.out.println("연결 끊음");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
