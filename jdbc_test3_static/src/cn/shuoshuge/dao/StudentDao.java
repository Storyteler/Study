package cn.shuoshuge.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cn.shuoshuge.entity.Student;
import cn.shuoshuge.util.DbHelp;
import cn.shuoshuge.util.RowMapper;

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

	public List<Student> findAll() {
		
		String sql = "select id,stu_name from student";
		return DbHelp.executeQueryAll(sql, new StudentRowMapper());
	}

	public class StudentRowMapper implements RowMapper<Student> {

		public Student rowMapper(ResultSet rs) throws SQLException  {
		Student stu = new Student();
		stu.setId(rs.getInt("id"));
		stu.setName(rs.getString("stu_name"));
		
		return stu;
	}

}
	
	
	
	
}
