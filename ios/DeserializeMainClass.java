package ios;
import java.io.*;

public class DeserializeMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	FileInputStream fis=null;
	ObjectInputStream ois=null;
	
	try
	{
		fis=new FileInputStream("C:/Users/newlin/OneDrive/Desktop/MyText3.txt");
		ois=new ObjectInputStream(fis);
		
		DateClass dc=(DateClass)ois.readObject();
		
		System.out.println("The day is "+dc.day);
		System.out.println("The month is "+dc.month);
		System.out.println("The year is "+dc.year);
	}
	catch(ClassNotFoundException cce)
	{
		cce.printStackTrace();
	}
	catch(IOException ioe)
	{
		ioe.printStackTrace();
	}
	finally
	{
		try
		{
			fis.close();
			ois.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}

	}

}
