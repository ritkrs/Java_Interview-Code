package ABCG;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Consumer {
	public static boolean isSorted(int[] arr)
	{
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]>arr[i+1])
			{
				return false;
			}
		}
		return true;
	   
	}
		
	
	public static void main(String[] args) {
	  int[] arr= {1,2,3,4,5,2};
	  System.out.println(isSorted(arr));
	}
}
