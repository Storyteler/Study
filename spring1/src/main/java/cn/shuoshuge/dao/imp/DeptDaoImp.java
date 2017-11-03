package cn.shuoshuge.dao.imp;

import cn.shuoshuge.dao.DeptDao;
import cn.shuoshuge.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DeptDaoImp implements DeptDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(Dept dept) {
        String sql = "insert into dept(dept_name) value(?)";
        jdbcTemplate.update(sql,dept.getDeptName());
    }

    public void findById() {

    }
}
