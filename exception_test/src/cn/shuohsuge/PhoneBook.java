package cn.shuohsuge;

public class PhoneBook {
	
	public void saveName(String name) throws NullPointerException,NamedontException {
		
		if(null == name) {
			throw new NullPointerException("���ֲ���Ϊnull");
		} if("".equals(name.trim())) {
			throw new NamedontException("���ֲ���Ϊ��");
		}
	}
	
	public void savePhone(String phone) throws PhonenumberdontException {
		
		if(phone == null) {
			throw new PhonenumberdontException("�绰����Ϊ��");
		}
		
	}

}
