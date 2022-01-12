package array;

import java.util.Arrays;

public class MinimumDifference {
	
	int minDi;
	public void minDiff(int[] arr)
	{
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<=arr.length;i++)
		{
			int j=arr[0];
			int k=arr[1];
			int minDi=k-j;	
			System.out.print(minDi);
		}	
		
		
	}
	public static void main(String[] args) {
		int[] arr= {10,55,33,51,65,77,88,43,90};
		MinimumDifference md=new MinimumDifference();
		md.minDiff(arr);
	}

}
