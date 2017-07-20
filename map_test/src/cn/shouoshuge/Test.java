package cn.shouoshuge;

//import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
//import java.util.Map.Entry;
import java.util.Set;

/**
 * @author fuzefeng
 *Map接口的子类HashMap和HashTable的使用
 *HashMap为线程非安全，HashTable为线程安全，使用方法相同
 */
public class Test {

	public static void main(String[] args) {
		
		Map<String,String> littlemap = new Hashtable<String,String>();
		littlemap.put("bb","jsjd");
		littlemap.put("cc", "jdfn");

		Map<String,String> map = new Hashtable<String,String>();
		map.put("a","hello");
		map.put("2jj","dot");
		map.put("df","gdss");
		map.put("3df","gds");
		map.put("1","hfdf");		
		map.put(" 3c3","35ved");
		
		littlemap.putAll(map);
		
		
		/*System.out.println(map.containsKey("a"));
		System.out.println(map.containsValue("gdss"));*/
		
//		System.out.println(map.get("2jj"));
/*		Set<Entry<String,String>> set = map.entrySet();
		for(Entry en : set) {
			System.out.println(en.getKey() + "->" + en.getValue());
		}*/
		
		Set<String> set = littlemap.keySet();
		for(String str : set) {
			System.out.println(str);
		}
		
		
	}

}
