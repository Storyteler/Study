package cn.shuoshuge.dao;

import java.util.List;

import cn.shuoshuge.entity.Student;
import cn.shuoshuge.util.DbHelp;
import cn.shuoshuge.util.StudentRowMapper;

public class StudentDao {

	public void del(int id) {
		
		String sql = "delete from student where id = ?";
		DbHelp.executeUpdate(sql, id);
		
	}
	
	public void insert(String name) {
		
		String sql = "insert into student(stu_name) values(?)";
		DbHelp.executeUpdate(sql,name);
		
	}
	
	public void update(String name,int id) {
		
		String sql = "update student set stu_name = ? where id = ?";
		DbHelp.executeUpdate(sql, name, id);
				
		
	}

	public Student findById(int id) {
		
		String sql = "select id,stu_name from student where id = ?";
		return (Student)DbHelp.executeQuery(sql,new StudentRowMapper(),id);
		
		}

	public List findAll() {
		
		String sql = "select id,stu_name from student";
		return DbHelp.executeQueryAll(sql, new StudentRowMapper());
	}

	
	
	
	
	
}
