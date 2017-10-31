package cn.shuoshuge.mapper;

import cn.shuoshuge.pojo.Dept;

import java.util.List;

public interface DeptMapper {

    List<Dept> findAll();
    Dept findById(Integer id);
//    Dept findByIdAndName(Integer id,String deptName);
    Dept findByIdAndName(Dept dept);
    void save(List<Dept> deptList);

}


