package practice;

import java.util.ArrayList;

public class FindRepeatedElements {
	
	public void isRepeat(int[] arr)
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					count++;
					a1.add(arr[i]);
					
				}
				
			}
			
		}

		System.out.println(a1.get(0));
		System.out.println(count);
	}
	public static void main(String[] args) {
		FindRepeatedElements fr=new FindRepeatedElements();
		int[] arr= {1,2,3,4,5,6,3,4};
		  fr.isRepeat(arr);
	}

}
 