package cn.shuoshuge.test;

import cn.shuoshuge.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class EasyTestCase {

    @Autowired
    private UserService userService;
    @Test
    public void select() {
        userService.select();
    }

}
