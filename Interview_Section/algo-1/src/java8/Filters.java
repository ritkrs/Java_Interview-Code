package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filters {
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		for(int i=0;i<=10;i++)
		{
			a1.add(i);
		}
		System.out.println(a1);
		List<Integer> a2=a1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(a2);
	}

}
