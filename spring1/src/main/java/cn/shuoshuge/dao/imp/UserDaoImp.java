package cn.shuoshuge.dao.imp;

import cn.shuoshuge.dao.UserDao;

public class UserDaoImp implements UserDao {

    public UserDaoImp() {
        System.out.println("-------------------------");
    }

    public void select() {
        System.out.println("selecet");
    }

    public void update() {
        System.out.println("update");
    }

}
