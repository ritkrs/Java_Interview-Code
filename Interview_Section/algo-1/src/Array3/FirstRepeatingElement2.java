package Array3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FirstRepeatingElement2 {
	public static void firstRepeatingElement2(int[] arr)
	{
		ArrayList a1=new ArrayList();
		Set s1=new HashSet();
		for (int i = 0; i < arr.length-1; i++) {
			
			if(arr[i]==arr[i+1])
			{
				a1.add(arr[i]);
				System.out.println("Ritesh"+a1.get(0));
			}
			
			else if(arr[i]!=arr[i+1])
			{
				s1.add(arr[i]);
			}
		}
		System.out.println("Ritesh2="+s1.iterator().next());
	}
	public static void main(String[] args) {
		int[] arr= {11,34,65,78,67,45,34,90};
		firstRepeatingElement2(arr);
		
	}

}
