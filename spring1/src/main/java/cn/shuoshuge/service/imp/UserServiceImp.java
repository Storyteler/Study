package cn.shuoshuge.service.imp;

import cn.shuoshuge.dao.UserDao;
import cn.shuoshuge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImp implements UserService {

    public UserServiceImp() {
        System.out.println("service------------");
    }
    @Autowired
    private UserDao userDao;

/*    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }*/

//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    public void select() {
        userDao.select();
    }
}
