package Array3;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonThirdArray {
	
	public static void commonArray(int[] arr1,int[] arr2)
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j])
				{
					a1.add(arr1[i]);
				}
				
			}
			
		}
		Object[] obj=a1.toArray();
		System.out.println("First Arrays="+Arrays.toString(arr1));
		System.out.println("Second Arrays="+Arrays.toString(arr2));
		System.out.println("New Arrays with similar elements="+Arrays.toString(obj));
	}
	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,6};
		int[] arr2= {4,5,6,8,9,10};
		commonArray(arr1, arr2);
	}
	
	
}
