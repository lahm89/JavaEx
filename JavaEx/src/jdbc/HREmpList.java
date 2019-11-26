package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HREmpList {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
			String sql = "SELECT first_name, last_name FROM employees ORDER BY first_name DESC";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.printf("%s %s%n", rs.getString(1), rs.getString(2));
			}
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC 드라이버 로드실패!");
		} catch (SQLException e) {
			System.err.println("SQL Error:"+e.getMessage());
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				
			}
		}
	}


}
