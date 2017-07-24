package cn.shuoshuge;

public class Girl extends Thread {
	
	private Account ac;
	
	public Girl(Account ac) {
		this.ac = ac;
	}
	
	@Override
	public void run() {

			ac.PickMoney(9000);
		
	}

}
