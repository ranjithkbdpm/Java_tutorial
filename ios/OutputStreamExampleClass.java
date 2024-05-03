package ios;
import java.io.*;

public class OutputStreamExampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOutputStream fos=null;
		
		try
		{
			fos=new FileOutputStream("C:/Users/newlin/OneDrive/Desktop/MyText2.txt",true);
			byte[] b= {65,32,66,32,67,32,68,32,69};
			
			fos.write(b);
			
			fos.flush();
			
			System.out.println("Successfully written");
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
			}
			catch(IOException ioe)
			{
				ioe.printStackTrace();
			}
		}
		
		

	}

}
