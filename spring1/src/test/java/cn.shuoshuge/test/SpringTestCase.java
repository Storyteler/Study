package cn.shuoshuge.test;

import cn.shuoshuge.dao.UserDao;
import cn.shuoshuge.dao.imp.UserDaoImp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTestCase {

    @Test
    public void getUserDao() {

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao userDao = (UserDao) applicationContext.getBean("userDaoImp");
/*        UserDao userDao = applicationContext.getBean("userDaoImp",UserDaoImp.class);
        UserDao userDao1 = applicationContext.getBean("userDaoImp",UserDao.class);
        System.out.println(userDao == userDao1);
        userDao.select();
        userDao.update();*/

    }

}
