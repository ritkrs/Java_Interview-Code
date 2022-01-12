package Array3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FirstRepeatingElement {
	 Set s1=new HashSet();
	 List l1=new ArrayList();
	public  void firstRepeating(int[] arr)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					l1.add(arr[i]);
					//First Repeating element
					System.out.println("First Repeating element = "+l1.get(0));
				}
				
				else if (arr[i]!=arr[j]) {
					s1.add(arr[i]);	
				}			
				}
			
		}
		//First Non repeating element
		System.out.println("First Non repeating element = "+s1.iterator().next());
		
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,5,6,4};
		FirstRepeatingElement fre=new FirstRepeatingElement();
		fre.firstRepeating(arr);
		
		
		
	}
}


