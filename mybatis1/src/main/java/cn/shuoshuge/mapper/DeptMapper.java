package cn.shuoshuge.mapper;

import cn.shuoshuge.pojo.Dept;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@CacheNamespace
public interface DeptMapper {

    List<Dept> findAll();
    @Select("SELECT * FROM dept WHERE id = #{id};")
    Dept findById(Integer id);
//    Dept findByIdAndName(Integer id,String deptName);
    Dept findByIdAndName(Dept dept);
    void save(List<Dept> deptList);

}


