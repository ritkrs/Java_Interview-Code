package Hashmap;

import java.util.Comparator;


	class MyComparator implements Comparator
	{
		public int compare(Object obj1,Object obj2)
		{
			String s3=(String)obj1;
			String s2=(String)obj2;
			return s3.compareTo(s2);
		}
	}



