package cn.shuoshuge.util;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface RowMapper<T> {
	
	T rowMapper(ResultSet rs) throws SQLException ;

}
