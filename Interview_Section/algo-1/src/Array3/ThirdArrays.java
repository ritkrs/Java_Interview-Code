package Array3;

import java.util.ArrayList;
import java.util.Arrays;

public class ThirdArrays {
	
	public static void thirdArrays(int[] arr1, int[] arr2)
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		int[] arr6=new int[10];
		for (int i = 0; i < arr1.length; i++) {
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
                  a1.add(arr1[i]);
                  
				}
			}
			
		}
				Object[] objArray=a1.toArray();
		for(int i=0;i<objArray.length;i++)
		{
			System.out.print(objArray[i]+",");
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,6};
		int[] arr2= {4,5,6,7,8,9};
		thirdArrays(arr1,arr2);
	}
	
}
