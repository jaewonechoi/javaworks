package dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertTest {

	public static void main(String[] args) {
		Connection conn = null;	//네트워크 연결 클래스
		PreparedStatement pstmt = null;	//sql 처리하는 인터페이스
		try {
			//JDBC 드라이버 등록
			Class.forName("oracle.jdbc.OracleDriver");
			
			//연결하기 - getConnection(url, user, passward)
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"c##mydb",
					"pwmydb");
			System.out.println("연결 성공!");
			
			//db 처리 작업
			//매개 변수화된 sql문 작성 - 동적 바인딩
			String sql = "INSERT INTO users(userid, username, userpassword, userage, useremail) "
					+ "VALUES (?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			//? 값 지정
			pstmt.setString(1, "admin0000");
			pstmt.setString(2, "관리자");
			pstmt.setString(3, "a1234");
			pstmt.setInt(4, 33);
			pstmt.setString(5, "admin0000@cloud.com");
			
			//sql 실행
			int rows = pstmt.executeUpdate();	//데이터를 보낼때
			System.out.println("저장된 행의 수: " + rows);
			//auto commit이 됨
		} catch (Exception e) {
			e.printStackTrace();
		} finally {		//반드시 수행되는 구간
			if(conn != null) {	//연결이 되어 있다면
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
