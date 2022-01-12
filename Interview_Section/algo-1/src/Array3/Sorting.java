package Array3;

import java.util.Arrays;

public class Sorting {
	public static void sortingArray(int[] arr)
	{
		int last;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		}
	
	public static void main(String[] args) {
		int[] arr= {7,8,4,1,2,3,4,};
		sortingArray(arr);
		
	}

}
