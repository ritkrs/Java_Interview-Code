package array;

import java.util.Arrays;

public class KthSmallest {
	public static int kthSmallest(int[] arr,int k)
	{
		Arrays.sort(arr);
		System.out.println(arr);
		
		return arr[k-1];
	}
	public static void main(String[] args) {
		int[] arr={12,3,5,7,19};
		int k=2;
		System.out.println("kth smallest elemnt is = "+kthSmallest(arr, k));
	}

}
