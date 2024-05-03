package ios;
import java.io.*;

public class DateClass implements Serializable{
	
	int day;
	int month;
	int year;
	
	public DateClass(int day,int month,int year)
	{
	this.day=day;
	this.month=month;
	this.year=year;
	}

}
