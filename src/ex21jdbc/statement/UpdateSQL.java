package ex21jdbc.statement;

import java.sql.SQLException;

public class UpdateSQL extends ConnectDB{

	public UpdateSQL(String user, String pass) {

		super(user, pass);
	}
	
	@Override
	void execute() {
		
		try {
			stmt = con.createStatement();
			
			String sql = "update member set name = 'testuser1', pass = '7777', regidate = sysdate where id = 'test1' ";
			System.out.println("sql=" + sql);
			
			int affected = stmt.executeUpdate(sql);
			System.out.println(affected + "행이 업데이트 됨");
			
		} catch (SQLException e) {

			System.out.println("쿼리오류");
			e.printStackTrace();
		
		}catch (Exception e) {

			System.out.println("알수 없는 예외 발생");
			e.printStackTrace();
		}
		finally {
			close();
		}
		
	}
	public static void main(String[] args) {
		new UpdateSQL("kosmo", "1234").execute();
	}
	
	
}
