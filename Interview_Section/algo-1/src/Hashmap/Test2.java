package Hashmap;

import java.util.Comparator;
import java.util.TreeSet;

public class Test2 {
	public static void main(String[] args) {
		TreeSet s1=new TreeSet(new MyComparator());
		s1.add("kl");
		s1.add("de");
		s1.add("ab");
		s1.add("bc");
		s1.add("gh");
		s1.add("ij");
		
		System.out.println(s1);
	}
}
