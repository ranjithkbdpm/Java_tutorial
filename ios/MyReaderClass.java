package ios;
import java.io.*;

public class MyReaderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//File f=new File("C:/Users/newlin/OneDrive/Desktop/MyText.txt");
		File f=new File("D:/Java_practise/io/MyText.txt");
		FileReader fr=null;
		BufferedReader br=null;
		try
		{
		fr=new FileReader(f);
		br=new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null)
		{
			String[] strArray=str.split(",");
			int total=0;
			
			for(int m=0;m<strArray.length;m++)
			{
				total+=Integer.parseInt(strArray[m]);
			}
			
			System.out.println("The total is "+total);
		}
			
			
			
			
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		finally
		{
			try
			{
				fr.close();
				br.close();
			}
			catch(IOException ioe)
			{
				ioe.printStackTrace();
			}
		}

	}

}
