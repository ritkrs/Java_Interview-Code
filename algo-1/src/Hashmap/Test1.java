package Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test1 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("ab");
		a1.add("bc");
		a1.add("cd");
		a1.add("de");
		
		HashMap a2=new HashMap();
		a2.put(1,"ja");
		a2.put(2,"va");
		a2.put(3,"ku");
		a2.put(4,"ma");
		a2.put(5,"rs");
		
		
		HashMap m1=new HashMap();
		System.out.println();
		m1.put(1, a1.add(a2));
		System.out.println(m1);
		
		
	}

}
