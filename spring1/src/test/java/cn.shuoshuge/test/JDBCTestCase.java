package cn.shuoshuge.test;

import cn.shuoshuge.pojo.Dept;
import cn.shuoshuge.service.DeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class JDBCTestCase {

    @Autowired
    private DeptService deptService;

    @Test
    public void save() {
        deptService.save(new Dept("fzf"));
    }

}
