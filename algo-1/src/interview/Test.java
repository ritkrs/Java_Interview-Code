package interview;
//list of Integerrs
//find 2nd largest elements

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	
	//int temp=0;
	public static void bubbleSorting(int[] arr)
	{
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;i<arr.length;j++)
			{
				if(arr[j]>arr[j+1])
				{
					 temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr= {5,4,8,3,2,1};
		bubbleSorting(arr);
		printArray(arr);

	}

}
