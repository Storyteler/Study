package cn.shuoshuge.app;

import java.util.Scanner;

import cn.shuoshuge.dao.AdminDao;
import cn.shuoshuge.entity.Admin;

public class App {
	
	Scanner input = new Scanner(System.in);
	

	public void startup() {
		
		System.out.println("请输入管理员名字");
		String a_name = input.next();
		System.out.println("请输入管理员密码");
		String a_password = input.next();
		
		AdminDao ad = new AdminDao();
		Admin admin = ad.findByName(a_name);
		
	}

}
