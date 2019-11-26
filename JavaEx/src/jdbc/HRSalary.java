package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HRSalary {
	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		// 객체 생성
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Scanner scanner = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
			System.out.print("최소 급여와 최대 급여를 입력해주세요 : ");
			int min = scanner.nextInt();
			int max = scanner.nextInt();
			String sql = "SELECT first_name, last_name, salary FROM employees WHERE salary>" + min +
					" AND salary<" + max + "ORDER BY salary";
			System.out.println("QUERY:" + sql);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			System.out.println("=============================");
			while(rs.next()) {
				System.out.printf("%s %s\t\t%d%n", rs.getString(1), rs.getString(2), rs.getInt(3));
			}
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패!");
		} catch (SQLException e) {
			System.err.println("SQL Error!");
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				
			}
		}
		scanner.close();
	}
}
