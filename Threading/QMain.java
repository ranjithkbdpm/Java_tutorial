package com.waitandnotify;

public class QMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q q=new Q();
		
		Producer p=new Producer(q);
		Consumer c=new Consumer(q);

	}

}
