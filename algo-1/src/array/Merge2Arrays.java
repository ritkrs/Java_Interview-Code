package array;

import java.util.Arrays;

public class Merge2Arrays { 
	public static void main(String[] args) {
		int[] arr1= {1,2,3,4};
		int[] arr2= {5,6,7,8};
		int length=arr1.length+arr2.length;
		int[] result=new int[length];
		int pos=0;
		for(int n:arr1)
		{
			result[pos]=n;
			pos++;
		}
		for(int n:arr2)
		{
			result[pos]=n;
			pos++;
		}
		System.out.println(Arrays.toString(result));
}}
