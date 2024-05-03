package thread_class;

public class MyPrintThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyPrintString mp=new MyPrintString();
		
		PrintStringThread ps=new PrintStringThread(mp,"Hello");
		PrintStringThread ps1=new PrintStringThread(mp,"Rajendran");
		PrintStringThread ps2=new PrintStringThread(mp,"How are you??");
		try
		{
			ps.t.join();
			ps1.t.join();
			ps2.t.join();
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}

	}

}
