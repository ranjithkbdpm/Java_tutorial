package ios;
import java.io.*;

public class MyWriterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOutputStream fos=null;
		DataOutputStream dos=null;
		
		try
		{
			fos=new FileOutputStream("C:/Users/newlin/OneDrive/Desktop/MyText2.txt",true);
			fos=new FileOutputStream("D:/Java_practise/io/MyText.txt",true);
			dos=new DataOutputStream(fos);
			
			
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}

	}

}
