package cn.shuohsuge;

public class Test {

	public static void main(String[] args) {
		
		PhoneBook pb = new PhoneBook();
		try {
			pb.savePhone(null);
		} catch (PhonenumberdontException e) {
			e.printStackTrace();
		}

/*		PhoneBook pb = new PhoneBook();
		pb.save("   ");*/
		
/*		try {
			
			int i = 10/0;
			int[] nums = new int[3];
			int num = nums[6];
			Integer in = new Integer("ajj");
			System.out.println("try");
			
		} catch(NumberFormatException e) {
			e.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}
		
		System.out.println("The End");*/
		
	}

}
