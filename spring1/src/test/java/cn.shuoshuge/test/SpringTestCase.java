package cn.shuoshuge.test;

import cn.shuoshuge.dao.UserDao;
import cn.shuoshuge.dao.imp.UserDaoImp;
import cn.shuoshuge.proxy.RealSubject;
import cn.shuoshuge.proxy.Subject;
import cn.shuoshuge.proxy.SubjectInvocationHandler;
import cn.shuoshuge.proxy.SubjectMethodInterceptor;
import cn.shuoshuge.service.UserService;
import cn.shuoshuge.service.imp.UserServiceImp;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;

public class SpringTestCase {

    @Test
    public void getUserDao() {
/*

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealSubject.class);
        enhancer.setCallback(new SubjectMethodInterceptor());

        RealSubject realSubject = (RealSubject) enhancer.create();
        realSubject.save();
*/

/*        RealSubject realSubject = new RealSubject();
        SubjectInvocationHandler subjectInvocationHandler = new SubjectInvocationHandler(realSubject);
        Subject subject =
                (Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),realSubject.getClass().getInterfaces(),subjectInvocationHandler);
        subject.save();
        subject.sayHellp();*/

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImp userService = applicationContext.getBean("userServiceImp", UserServiceImp.class);
        userService.select();

//        UserDao userDao = (UserDao) applicationContext.getBean("userDaoImp");
/*        UserDao userDao = applicationContext.getBean("userDaoImp",UserDaoImp.class);
        UserDao userDao1 = applicationContext.getBean("userDaoImp",UserDao.class);
        System.out.println(userDao == userDao1);
        userDao.select();
        userDao.update();*/

    }
    @Test
    public void te() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userServiceImp");
        userService.select();
    }

}
