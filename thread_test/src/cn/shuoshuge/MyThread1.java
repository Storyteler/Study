package cn.shuoshuge;

public class MyThread1 extends Thread {
	
	@Override
	public void run() {
		

		
		for(int i = 0;i < 100;i++) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread1: " + i);
		}
		
		
	}

}
