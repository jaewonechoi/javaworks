package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserSelectOneTest1 {
	
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
			String sql = "SELECT * FROM users WHERE uesrid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "today");
			
			//sql 실행 및 검색
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {		//검색한 데이터가 있으면(찾았으면)
				//db에서 userid(칼럼은 소문자)를 꺼내옴
				User1 user1 = new User1();
				user1.setUserId(rs.getString("userid"));
				user1.setUserName(rs.getString("username"));
				user1.setUserPassword(rs.getString("userpassword"));
				user1.setUserAge(rs.getInt("userage"));
				user1.setUserEmail(rs.getString("useremail"));
				//객체 정보를 문자열로 출력함
				System.out.println("userId: " + user1.getUserId());
				System.out.println("userName: " + user1.getUserName());
				System.out.println("userPassword: " + user1.getUserPassword());
				System.out.println("userAge: " + user1.getUserAge());
				System.out.println("userEmail: " + user1.getUserEmail());
			}else {
				System.out.println("아이디가 존재하지 않습니다");
			}
			rs.close();
			pstmt.close();
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
