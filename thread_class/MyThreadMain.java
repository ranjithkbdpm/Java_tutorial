package thread_class;

public class MyThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread m=new MyThread();
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("Main thread counter is "+i);
			try
			{
				Thread.sleep(5000);
				
				//m.t.join();
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
		
		System.out.println("Main thread completed");

	}

}
