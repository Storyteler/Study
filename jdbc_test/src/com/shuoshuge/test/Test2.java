package com.shuoshuge.test;

import com.shuoshuge.dao.StudentDao;
import com.shuoshuge.entity.Student;

public class Test2 {

	public static void main(String[] args) {

		StudentDao dao = new StudentDao();
		
		Student student = dao.nameById(2);
		System.out.println(student);
		
	}

}
