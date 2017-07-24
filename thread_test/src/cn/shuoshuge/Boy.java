package cn.shuoshuge;

public class Boy extends Thread {
	
	private Account ac;
	
	public Boy (Account ac) {
		this.ac = ac;
	}

	@Override
	public void run() {
		
		ac.PickMoney(9000);
		
	}
	
}
