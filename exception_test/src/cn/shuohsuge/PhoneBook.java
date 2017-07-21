package cn.shuohsuge;

public class PhoneBook {
	
	public void saveName(String name) throws NullPointerException,NamedontException {
		
		if(null == name) {
			throw new NullPointerException("名字不能为null");
		} if("".equals(name.trim())) {
			throw new NamedontException("名字不能为空");
		}
	}
	
	public void savePhone(String phone) throws PhonenumberdontException {
		
		if(phone == null) {
			throw new PhonenumberdontException("电话不能为空");
		}
		
	}

}
