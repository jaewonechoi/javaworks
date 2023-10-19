package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardEx1 {
	
	private Scanner scanner = new Scanner(System.in);
	private Connection conn;
	private PreparedStatement pstmt;
	
	private String driverClass = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521/xe";
	private String user = "c##mydb";
	private String password = "pwmydb";
	
	//생성자 - 매개변수 없는 생성자 사용
	public BoardEx1() {
		try {
			Class.forName(driverClass);
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("db 연결 성공" + conn);
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
		
	}
	
	public void list() {
		System.out.println();
		System.out.println("[게시물 목록]");
		System.out.println("--------------------------------------------------------------");
		System.out.printf("%-4s%-12s%-20s%-20s\n", "no", "writer", "date", "title");
		System.out.println("--------------------------------------------------------------");
		
		try {
			String sql = "SELECT bno, btitle, bcontent, bwriter "
					+ " FROM board ORDER BY bno DESC";
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				board.setBtitle(rs.getString("btitle"));
				
				//게시물 출력
				System.out.printf("%-4s%-12s%-12s%-40s\n", 
						board.getBno(),
						board.getBwriter(),
						board.getBdate(),
						board.getBtitle());
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}
		
		mainMenu();
	}
	
	public void mainMenu() {
		System.out.println("--------------------------------------------------------------");
		System.out.println("1.Create | 2.Read | 3.Clear | 4.Exit");
		System.out.print("메뉴 선택: ");
		
		String menuNo = scanner.nextLine();
		switch(menuNo) {
		case "1":
			create(); break;
		case "2":
			read(); break;
		case "3":
			clear(); break;
		case "4":
			exit(); break;
		}
		
	}
	
	public void create() {
		//System.out.println("create() 메서드 실행됨");
		Board board = new Board();
		System.out.println("[새 게시물 입력]");
		
		System.out.println("제목: ");
		String title = scanner.nextLine();
		board.setBtitle(title);
		
		System.out.println("내용: ");
		String content = scanner.nextLine();
		board.setBtitle(content);
		
		System.out.println("작성자: ");
		String writer = scanner.nextLine();
		board.setBtitle(writer);
		
		//db 처리
		try {
			String sql = "INSERT INTO board(bno, btitle, bcontent, bwriter) "
					+ "VALUES (seq.NEXTVAL, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getBtitle());
			pstmt.setString(2, board.getBcontent());
			pstmt.setString(3, board.getBwriter());
			
			pstmt.executeUpdate();	//sql 실행문
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}	
		list();
	}
	
	public void read() {
		System.out.println("read() 메서드 실행됨");
		list();
	}
	
	public void clear() {
		System.out.println("clear() 메서드 실행됨");
		list();
	}
	
	public void exit() {
		System.out.println("*** 게시판을 종료합니다 ***");
		System.exit(0);
	}
	
	public static void main(String[] args) {
		BoardEx1 board1 = new BoardEx1();
		board1.list();
	}
}
