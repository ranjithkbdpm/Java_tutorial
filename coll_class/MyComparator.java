package coll_class;

import java.util.*;

public class MyComparator implements Comparator<Number>{

	public int compare(Number a,Number b)
	{
		if(b.doubleValue() < a.doubleValue())
		{
			return -1;
		}
		else
		{
			return +1;
		}
		
	}
}
