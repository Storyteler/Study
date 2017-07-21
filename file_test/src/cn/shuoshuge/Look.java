package cn.shuoshuge;

import java.io.File;

public class Look {
	
	public static void lookAllFileName(File file) {
		
		if(file.exists()) {
			if(file.isFile()) {
				System.out.println(file.getName());
			} else {
				File[] files = file.listFiles();
				if(files.length == 0) {
					System.out.println(file.getName());
				} else {
					for(File f : files) {
						lookAllFileName(f);
					}
				}
			}
		} else {
			System.out.println("文件不存在");
		}
		
	}

}
