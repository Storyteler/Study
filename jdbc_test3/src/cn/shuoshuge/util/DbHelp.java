package cn.shuoshuge.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DbHelp<T> {
	
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql:///db22";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	
	private Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}

	public void executeUpdate(String sql,Object... params) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			
			for (int i = 1; i <= params.length; i++) {
				ps.setObject(i, params[i - 1]);
			}
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn,ps);
		}
		
	}
	
	private void close(Connection conn, Statement ps) {
		try {
			if(ps != null && !ps.isClosed()) {
				ps.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public T executeQuery(String sql,RowMapper<T> rm,Object... params) {
		
		T obj = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			
			for (int i = 0; i < params.length; i++) {
				ps.setObject(i+1, params[i]);
			}
			
			rs = ps.executeQuery();
			if(rs.next()) {
				obj = rm.rowMapper(rs);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs,ps,conn);
		}
		return obj;
		
		
	}
	
	private void close(ResultSet rs, Statement ps,Connection conn) {
		try {
			if(rs != null && !rs.isClosed()) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn,ps);
		}
	}

	public List<T> executeQueryAll(String sql,RowMapper<T> rm) {
		
		List<T> list = new ArrayList<T>();
		T obj = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				obj = rm.rowMapper(rs);
				list.add(obj);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs,ps,conn);
		}
		return list;
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
