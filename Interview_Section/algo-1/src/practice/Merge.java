package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge {
	public void merge(int[] arr1,int[] arr2)
	{
	 ArrayList<Integer> a1=new ArrayList<Integer>();
	 for (int i = 0; i < arr1.length; i++) {
		 a1.add(arr1[i]);
	}
	 for (int j = 0; j < arr2.length; j++) {
		a1.add(arr2[j]);
	}
	 Object[] objArray=a1.toArray();
	 for (int i = 0; i < objArray.length; i++) {
		 System.out.print(objArray[i]+" ");
		
	}
	}
	public static void main(String[] args) {
		Merge m1=new Merge();
		int[] arr1= {1,2,3,4};
		int[] arr2= {5,6,7,8};
		m1.merge(arr1, arr2);
	}

}
