package Array3;

import java.util.Arrays;

public class ArraySortedOrNot {
	
	public static boolean sortedArrayOrNot(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,7,6,8};
		
		System.out.println(sortedArrayOrNot(arr));
		
	}
	


}
