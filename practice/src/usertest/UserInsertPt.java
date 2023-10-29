package usertest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertPt {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String user	= "c##mydb";
		String password = "pwmydb";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공!");
			
			String sql = "INSERT INTO users(userid, username, userpassword, userage, useremail) "
					+ "VALUES (?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "userid");
			pstmt.setString(2, "username");
			pstmt.setString(3, "userpassword");
			pstmt.setInt(4, 30);
			pstmt.setString(5, "useremail");
			
			int row = pstmt.executeUpdate();
			System.out.println("저장 성공!" + row);
			pstmt.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
					System.out.println("연결 종료");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
