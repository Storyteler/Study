package cn.shuoshuge.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.shuoshuge.entity.Admin;
import cn.shuoshuge.util.DbHelp;
import cn.shuoshuge.util.RowMapper;

public class AdminDao {
	
	private class AdminRowMapper implements RowMapper<Admin>{

		@Override
		public Admin rowMapper(ResultSet rs) throws SQLException {
			Admin admin = new Admin();
			admin.setId(rs.getInt("id"));
			admin.setA_name(rs.getString("a_name"));
			admin.setA_password(rs.getString("a_password"));
			
			return admin;
		}}

	public Admin findByName(String a_name) {
		
		
		String sql = "select id,a_name,a_password from admin where a_name = ?";
		return DbHelp.executeQuery(sql, new AdminRowMapper(), a_name);
		
	}

}
