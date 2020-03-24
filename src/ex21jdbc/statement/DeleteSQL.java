package ex21jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteSQL {
	
	private Connection con;
	private Statement stmt;
	
	//생성자에서는 드라이버에 대한 로드만 진행
	public DeleteSQL() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		}
		catch(ClassNotFoundException e ) { 
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	//oracle db에 대한 연결을 진행
	public void connect () {
		try {
			con = DriverManager.getConnection(
					"jdbc:oracle:thin://@localhost:1521:orcl",
					"kosmo",
					"1234");
		}
		catch(SQLException e) {
			System.out.println("데이터베이스 연결오류");
			e.printStackTrace();
		}
	}
	
	private void execute() {
		connect();
		try {
			stmt = con.createStatement();
			String query = "delete from member where id = 'test1'";
			int affected = stmt.executeUpdate(query);
			
			System.out.println(affected + "행이 삭제됨");
		}
		catch(SQLException e) {
			System.out.println("쿼리 실행 오류");
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	private void close() {
		try {
			if(stmt!=null) stmt.close();//stmt 객체 자원반납
			if(con!=null) con.close(); //con 객체 자원 반납.
			System.out.println("자원반납완료");
			
		}
		catch(SQLException e) {
			System.out.println("자원 반납 시 오류가 발생하였습니다.");
		}
	}
	public static void main(String[] args) {
		new DeleteSQL().execute();

	}

}
