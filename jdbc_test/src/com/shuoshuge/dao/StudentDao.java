package com.shuoshuge.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.shuoshuge.entity.Student;

public class StudentDao {

	public Student nameById(int i) {
		
		Student student = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql:///db22","root","root");
			
			String sql = "select id,stu_name from student where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,i);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				student = new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("stu_name"));
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return student;
		
	}
	
	

}
