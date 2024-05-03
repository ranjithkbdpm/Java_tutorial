package com.waitandnotify;

public class Consumer implements Runnable{
	
		Thread t;
		Q q;
		
		public Consumer(Q q)
		{
			this.q=q;
			t=new Thread(this,"consumer thread");
			t.start();
		}
		
		public void run()
		{
			while(true)
			{
				q.get();
			}
		}
		
		
		
		
	}


