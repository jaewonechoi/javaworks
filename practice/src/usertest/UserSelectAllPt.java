package usertest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserSelectAllPt {

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
			System.out.println("연결 성공" + conn);
			
			String sql = "SELECT * FROM users";
			pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			List<UserPt1> userList = new ArrayList<>();
			while(rs.next()){
				UserPt1 user1 = new UserPt1();
				user1.setUserId(rs.getString("userid"));
				user1.setUserName(rs.getString("username"));
				user1.setUserPassword(rs.getString("userpassword"));
				user1.setUserAge(rs.getInt("userage"));
				user1.setUserEmail(rs.getString("useremail"));
				userList.add(user1);
			}
			
			for(UserPt1 user2 : userList) {
				System.out.println(user2.getUserId());
			}
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
