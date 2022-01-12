package Array3;

import java.util.Arrays;

public class LeftRotate {
	
	public static void leftRo(int[] arr)
	{
		int first=arr[0];
		int second=arr[1];
		System.out.println(arr[0]);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr[i+i];
			//arr[i]=arr[i+2];
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8};
		leftRo(arr);
		System.out.println("hello");
	}

}
