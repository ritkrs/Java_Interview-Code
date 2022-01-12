package interview;

import java.util.ArrayList;

public class Test1 {
static	ArrayList<Integer> a1=new ArrayList<Integer>();
	
	public static void sort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			a1.add(arr[i]);
		}
		System.out.println(a1.get(arr.length-2));
	}
	public static void main(String[] args) {
		int[] arr= {2,5,8,6,3};
		sort(arr);
	}

}
