package practice;

import java.util.Arrays;

public class MinimumDiffrence {
	public void minDiff(int[] arr1)
	{
		int temp;
		int b;
		for (int i = 0; i < arr1.length-1; i++) {
			for (int j = 0; j < arr1.length-1; j++) {
				if (arr1[j]>arr1[j+1]) {
					temp=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp;
					
				}
			}
			
		}
		System.out.println(Arrays.toString(arr1));
		b=arr1[1]-arr1[0];
		System.out.println(b);
		
	}
	public static void main(String[] args) {
		MinimumDiffrence md=new MinimumDiffrence();
		int[] arr1= {10,55,33,51,65,77,88,43,90};
		md.minDiff(arr1);
		
	}

}
