package com.waitandnotify;

public class Q {
	
	
	int n;
	
	boolean valueSet=false;
	
	public synchronized void get()
	{
		while(!valueSet)
		{
			try
			{
				wait();
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
		System.out.println("GOT:"+n);
		valueSet=false;
		notify();
	}
	
	public synchronized int put(int n)
	{
		if(valueSet)
		{
			try
			{
				wait();
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
		this.n=n;
		System.out.println("PUT:"+n);
		valueSet=true;
		notify();
		return n;
	}

}
