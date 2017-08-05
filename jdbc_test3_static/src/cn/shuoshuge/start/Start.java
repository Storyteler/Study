package cn.shuoshuge.start;

import java.util.List;

import cn.shuoshuge.dao.StudentDao;
import cn.shuoshuge.entity.Student;

public class Start {

	public static void main(String[] args) {

		StudentDao sd = new StudentDao();
		List<Student> list = sd.findAll();

//		sd.del(1);
		
//		sd.update("fuzefeng",2);
		
//		Student stu = sd.findById(3);
		for (Object object : list) {
			Student stu = (Student)object;
			System.out.println(stu);
		}
		
	}

}
