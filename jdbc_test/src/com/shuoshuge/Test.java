package com.shuoshuge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {

	public static void main(String[] args) {

			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql:///db22","root","root");
				String sql = "select id,stu_name from student";
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("stu_name");
					System.out.println("id\t" + id + "\tname\t" + name); 
				}
				
				ps.close();
				conn.close();
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		
	}

}
