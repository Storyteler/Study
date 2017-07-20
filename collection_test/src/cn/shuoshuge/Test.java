package cn.shuoshuge;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @author fuzefeng
 *  集合：Collection中List和Set接口的实现类ArrayList，Vector，HashSet，TreeSet的使用
 */
public class Test {

	public static void main(String[] args) {

		Vector<String> list = new Vector<String>();
		list.add("Hello");
		list.add("World");
		list.add(1,"amazing");
		list.add("Hello");
		list.addElement("hao");
		
		
		/*System.out.println(list.firstElement());
		System.out.println(list.lastElement());*/
		
		/*for(String str : list) {			
			System.out.println(str);
		}*/
		
//		list.clear();
				
//		System.out.println(list.remove("Hello"));
		
//		System.out.println(list.set(1,"Hello"));
		
//		System.out.println(list.get(1));
		
/*		String[] strs = new String[list.size()];
		strs = list.toArray(strs);
		list.toArray();
		
		for(String str : strs) {			
			System.out.println(str);
		}*/
		
		
		/*System.out.println(list.indexOf("Hello"));
		System.out.println(list.lastIndexOf("Hello"));*/
		
//		System.out.println(list.contains("Hell"));
		
//		System.out.println(list.isEmpty());
		
//		System.out.println(list.size());
		
	}

}
