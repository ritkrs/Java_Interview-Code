package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer>a1=new ArrayList<Integer>();
		for(int i=0;i<=10;i++)
		{
			a1.add(i);
		}
		System.out.println(a1);
		
		//Arraylist to Array
		Object[] obj=a1.toArray();
		System.out.println("Arraylist to Array"+Arrays.toString(obj));
		
		//Array to arraylist
		ArrayList a2=new ArrayList(Arrays.asList(obj));
		System.out.println("Array to arraylist"+a2);
		
		//Arraylist to Array
		Object obj1=a2.toArray();

		
		
		
		
		
		
		
		List<Integer> l1=a1.stream().filter(a-> a%2==0).collect(Collectors.toList());
		System.out.println(l1);
	}
}
 