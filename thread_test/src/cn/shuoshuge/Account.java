package cn.shuoshuge;

import java.util.concurrent.locks.ReentrantLock;

public class Account {
	
	public int money = 10000;
	ReentrantLock rt = new ReentrantLock();
	
	public void PickMoney(int money) {
		
		rt.lock();
		if(this.money < money) {
			System.out.println("取款失败");
		} else {
			this.money = this.money - money;
			System.out.println("取款成功，余额为" + this.money);
		}
		rt.unlock();
		
/*		synchronized(this) {
			if(this.money < money) {
				System.out.println("取款失败");
			} else {
				this.money = this.money - money;
				System.out.println("取款成功，余额为" + this.money);
			}
		}*/


		
	}
	
/*	public synchronized void PickMoney(int money) {
		
		if(this.money < money) {
			System.out.println("取款失败");
		} else {
			this.money = this.money - money;
			System.out.println("取款成功，余额为" + this.money);
		}

		
	}*/

}
