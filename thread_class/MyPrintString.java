package thread_class;

public class MyPrintString {
	
	public void printString(String str)
	{
		System.out.println("["+str);
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		System.out.println("]");
	}

}
