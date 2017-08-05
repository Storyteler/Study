package cn.shuoshuge.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.shuoshuge.entity.Student;

public class StudentRowMapper implements RowMapper {

	@Override
	public Object rowMapper(ResultSet rs) throws SQLException  {
		Student stu = new Student();
		stu.setId(rs.getInt("id"));
		stu.setName(rs.getString("stu_name"));
		
		return stu;
	}

}
