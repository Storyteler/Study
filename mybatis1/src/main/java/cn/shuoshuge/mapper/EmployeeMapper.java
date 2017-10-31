package cn.shuoshuge.mapper;

import cn.shuoshuge.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {

    Employee findById(Integer id);
    List<Employee> findAll();
    List<Employee> findByDeptId(Integer id);

}
