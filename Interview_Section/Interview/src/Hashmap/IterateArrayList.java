package Hashmap;

import java.util.ArrayList;
import java.util.List;

public class IterateArrayList {
	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add("ab");
		l1.add("bc");
		l1.add("cd");
		l1.add("ef");
		l1.add("gh");
		l1.add("ij");
		
		for(int i=0;i<l1.size();i++)
		{
			System.out.print(l1.get(i)+",");
		}
	}

}
