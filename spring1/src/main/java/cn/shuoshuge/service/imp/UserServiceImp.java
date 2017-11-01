package cn.shuoshuge.service.imp;

import cn.shuoshuge.dao.UserDao;
import cn.shuoshuge.service.UserService;

public class UserServiceImp implements UserService {

    public UserServiceImp() {
        System.out.println("service------------");
    }

    private UserDao userDao;

/*    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }*/

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void select() {
        userDao.select();
    }
}
