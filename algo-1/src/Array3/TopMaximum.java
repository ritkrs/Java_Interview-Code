package Array3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TopMaximum {
	
	public static void topMaximum(int[] arr)
      {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		List a1=new ArrayList();
		for(int i=0;i<=arr.length-1;i++)
		{
			
			a1.add(arr[i]);
			
		}
		System.out.println(a1);
		System.out.println(a1.get(arr.length-1));
		System.out.println(a1.get(arr.length-2));
		System.out.println(a1.get(arr.length-3));
	}
	//How can i save a data or array element on particular index in java.
	public static void main(String[] args) {
		int[] arr= {23,45,67,89,90,67,54,32,40};
		topMaximum(arr);
	}

}
