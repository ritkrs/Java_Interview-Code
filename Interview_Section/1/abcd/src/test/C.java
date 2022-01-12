package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class C{
	public static void main(String[] args) {
		Map m1=new HashMap();
		m1.put(1, "ab");
		m1.put(2, "ab");
		m1.put(3, "ab");
		m1.put(4, "ab");
		System.out.println(m1.size());
		
	}
	@Override
	public int hashCode()
	{
		return 0;
	}
}


