package ios;
import java.io.*;

public class SerializationMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try
		{
			fos=new FileOutputStream("C:/Users/newlin/OneDrive/Desktop/MyText3.txt");
			oos=new ObjectOutputStream(fos);
			
			DateClass dc=new DateClass(25,02,2024);
			oos.writeObject(dc);
			
		    oos.flush();
		    fos.flush();
		    
		    System.out.println("Object written successfully");
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		finally
		{
			try
			{
				fos.close();
				oos.close();
			}
			catch(IOException ioe)
			{
				ioe.printStackTrace();
			}
		}
		

	}

}
