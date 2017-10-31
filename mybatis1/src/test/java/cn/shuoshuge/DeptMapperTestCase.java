package cn.shuoshuge;

import cn.shuoshuge.mapper.DeptMapper;
import cn.shuoshuge.pojo.Dept;
import cn.shuoshuge.pojo.Employee;
import cn.shuoshuge.util.GetSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DeptMapperTestCase {

    private SqlSession session;
    private DeptMapper deptMapper;

    @Before
    public void start() {
        session = GetSqlSessionFactory.getSqlSession(true);
        deptMapper = session.getMapper(DeptMapper.class);
    }

    @After
    public void end() {
        session.close();
    }

    @Test
    public void findById() {
        Dept dept = deptMapper.findById(1);
        System.out.println(dept);
    }

    @Test
    public void findAll() {
        List<Dept> deptList = deptMapper.findAll();
        for (Dept dept : deptList) {
            System.out.println(dept);
        }
        List<Employee> list = deptList.get(0).getEmployeeList();
        for (Employee employee : list) {
            System.out.println(employee);
            System.out.println("---------------");
        }
    }

    @Test
    public  void findByIdAndName() {

        Dept dept = new Dept(0,"java开发部");
        Dept dept1 = deptMapper.findByIdAndName(dept);
        System.out.println(dept1);
//        多参数处理
//        方法一
//        Dept dept = deptMapper.findByIdAndName(1,"java开发部");
//        System.out.println(dept);
    }

    @Test
    public void save() {
        List<Dept> deptList = new ArrayList<Dept>();
        deptList.add(new Dept("jack"));
        deptList.add(new Dept("rose"));
        deptList.add(new Dept("wang"));
//        for (Dept dept : deptList) {
//            System.out.println(dept);
//        }
        deptMapper.save(deptList);
    }

}
