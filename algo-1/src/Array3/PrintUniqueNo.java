package Array3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PrintUniqueNo {
	public static void printUnique(int[] arr)
	{
		int k=2;
		ArrayList<Integer> a1=new ArrayList<Integer>();
		Set<Integer> s1=new HashSet<Integer>();
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					a1.add(arr[i]);
					//System.out.println(arr[j]);
				}
				else if (arr[i]!=arr[j]) {
					s1.add(arr[i]);
					
				}
			}
		}
		System.out.println("arraylist"+a1);
		System.out.println("set"+s1);
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,1,2,3,4};
		printUnique(arr);
	}

}
