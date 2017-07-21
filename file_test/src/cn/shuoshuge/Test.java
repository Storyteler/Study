package cn.shuoshuge;

import java.io.File;
import java.io.IOException;

/**
 * @author fuzefeng
 * File类的使用
 *
 */
public class Test { 
	
	public static void main(String[] args) {

		Look.lookAllFileName(new File("F:/Heroes of the Storm"));
		
		/*File file1 = new File("f:");
		File file = new File(file1,"avsv");*/
		
		
		
		/*System.out.println(file1.getTotalSpace());
		System.out.println(file1.getFreeSpace());*/
/*		File[] files = file.listFiles();
		for(File f : files) {
			System.out.println(f.getName());
		}*/
		
		
		/*File file2 = new File("f:/avsv/djfdj/bdj/jfj/jj");
		System.out.println(file2.mkdirs());*/
		
/*		if(file.exists()) {
			file.delete();
		}
		
		try {
			System.out.println(file.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		/*System.out.println(file.length());
		System.out.println(file1.length());*/
		
//		System.out.println(file.isHidden());
		
		/*System.out.println(file.isDirectory());
		System.out.println(file.isFile());*/
		
//		System.out.println(file.exists());
		
//		System.out.println(file.toURI());
		
//		System.out.println(file1.isAbsolute());
		
//		System.out.println(file.getPath());
		
/*		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getParent());
		System.out.println(file.getParentFile());*/
		
/*		File file2 = new File("f:");
		
		System.out.println(file.equals(file1));
		System.out.println(file.equals(file2));*/
		
//		System.out.println(file.compareTo(file1));
		
//		File file  = new File("f:","a.txt");
		
//		File file = new File("f:/a.txt");
		
	/*	System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.canExecute());*/
		
	}

}
