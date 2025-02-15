package study01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class App {
		
	public static void main(String[] args) {
		String driver = "org.mariadb.jdbc.Driver";
		try {
			System.out.println("JDBC Start!");
			Class.forName(driver);
			// http://prj1119.tplinkdns.com:80/page1   
			// jdbc:mariadb://prj1119.tplinkdns.com:8181/edu
			String url = "jdbc:mariadb://prj1119.tplinkdns.com:8181/edu";
			String id = "user6";
			String pwd = "user6";
			
			Connection conn = DriverManager.getConnection(url, id, pwd);
			// 접속을 위한 코드
			System.out.println("JDBC Connection OK");
			
			String sql = "SELECT * FROM users WHERE 삭제여부 = 0";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			List<User> list = new ArrayList<User>();
		
			
			while(rs.next()) {
				User user = new User();
				
				user.set번호( rs.getInt(1) );
				user.set이메일( rs.getString(2) );
				user.set비밀번호( rs.getString(3) );
				user.set삭제여부( rs.getBoolean(4) );
				System.out.println(user);			
				list.add(user);
			}
						
			System.out.println(list.size());
			
			rs.close();
			ps.close();		
			conn.close();
			// 종료를 위한 코드	
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC Driver No");

		} catch (SQLException e) {
			System.out.println("JDBC Connection No");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}


