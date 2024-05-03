package thread_class;

public class MyThread implements Runnable{
	Thread t;
	
	public MyThread()
	{
	 t=new Thread(this,"Child Thread");
	 t.start();
		
	}
	
	
	public void run()
	{
		
		for(int i=6;i<=10;i++)
		{
			System.out.println("Child thread counter is "+i);
			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
		
		System.out.println("Child Thread Completed");
	}

}
