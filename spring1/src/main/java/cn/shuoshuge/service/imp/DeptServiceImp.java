package cn.shuoshuge.service.imp;

import cn.shuoshuge.dao.DeptDao;
import cn.shuoshuge.pojo.Dept;
import cn.shuoshuge.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeptServiceImp implements DeptService {

    @Autowired
    private DeptDao deptDao;

    public void save(Dept dept) {
        deptDao.save(dept);
    }
}
