package com.waitandnotify;

public class Producer implements Runnable{
	
	Thread t;
	Q q;
	public Producer(Q q)
	{
		this.q=q;
		t=new Thread(this,"Producer Thread");
		t.start();
	}
	
	public void run()
	{
		int n=0;
		
		while(true)
		{
			q.put(n++);
		}
	}

}
