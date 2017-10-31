package cn.shuoshuge;

import cn.shuoshuge.mapper.EmployeeMapper;
import cn.shuoshuge.pojo.Employee;
import cn.shuoshuge.util.GetSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class EmployeeTestCase {

    @Test
    public void findById() {
        SqlSession sqlSession = GetSqlSessionFactory.getSqlSession(true);
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = employeeMapper.findById(1);
        System.out.println(employee);
        sqlSession.close();
    }

    @Test
    public void findAll() {
        SqlSession session = GetSqlSessionFactory.getSqlSession(true);
        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
        List<Employee> list = employeeMapper.findAll();
        for(Employee employee : list) {
            System.out.println(employee);
        }
        session.close();
    }

}
