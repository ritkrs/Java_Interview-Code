package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IterateHashMap {
	public static void main(String[] args) {
		
		Map<Integer, String> m1=new HashMap<Integer, String>();
		m1.put(1, "ab");
		m1.put(2, "bc");
		m1.put(3, "cd");
		m1.put(4, "ef");
		m1.put(5, "gh");
		
		//Iterate Keys and values both
		for(Entry<Integer, String>s1:m1.entrySet())
		{
			System.out.println("key="+s1.getKey()+","+"values="+s1.getValue());
		}
		//Iterate keys only
		for(Integer a1:m1.keySet())
		{
			System.out.print("keys="+a1+"/");
		}
		//Iterate values only
		for(String s5:m1.values())
		{
			System.out.print("Values="+s5);
		}
	}

}
