package cn.shuoshuge;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		
		
		ArrayList list = (ArrayList) Collections.synchronizedList(new ArrayList());
		
/*		Account ac = new Account();
		Boy boy = new Boy(ac);
		Girl girl = new Girl(ac);
		boy.start();
		girl.start();*/
		
		
/*		MyThread1 th1 = new MyThread1();
		th1.setDaemon(true);
		th1.start();*/
		
/*		Thread th2 = new Thread(new MyThread2());
		th2.start();*/
		
/*		for(int i = 0;i < 100;i++) {
			try {
				th1.join();
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Main: " + i);
		}*/
	}

}
