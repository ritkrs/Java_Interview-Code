package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ThirdArray {
	
	public void makeThirdArray(int[] arr1,int[] arr2)
	{
	    int count=0;	
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					count++;
//					a1.add(arr1[i]);
				}
				
			}
			
		}
		
		int[] arr3=new int[count];
		for (int i = 0; i < arr3.length; i++) {
			//System.out.println("This is Array Third with common elemnts from both of the arrays.");
			System.out.print(arr3[i]+" ");
			
		}
	}
	public static void main(String[] args) {
		ThirdArray ta=new ThirdArray();
		int[] arr1= {1,2,3,4,5,6,7};
		int[] arr2= {1,2,3,4,5,7,8,9};
		ta.makeThirdArray(arr1, arr2);
		
	}
}
