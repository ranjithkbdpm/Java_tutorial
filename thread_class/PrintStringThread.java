package thread_class;

public class PrintStringThread implements Runnable{

	Thread t;
	MyPrintString mp;
	String str;
	
	public PrintStringThread(MyPrintString mp, String str)
	{
		this.mp=mp;
		this.str=str;
		t=new Thread(this,"Print String Thread");
		t.start();
	}
	
	public void run()
	{
		synchronized(mp)
		{
		mp.printString(str);
		}
	}
}
