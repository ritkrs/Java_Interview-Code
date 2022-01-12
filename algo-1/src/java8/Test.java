package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> a3=new ArrayList<Integer>();
		a3.add(5);
		a3.add(44);
		a3.add(3);
		a3.add(11);
		a3.add(7);
		ArrayList<Integer> a1=new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
		{
			a1.add(i);
			
		}
		System.out.println(a1);
		List<Integer> a2=a1.stream().filter(j-> j%2==0).collect(Collectors.toList());
		System.out.println(a2);
		List<Integer> a4=a3.stream().sorted().collect(Collectors.toList());
		System.out.println(a4);
		
	}

}
         //collect() == This method is used for collect the elements 
		//from stream and stored into specified object.