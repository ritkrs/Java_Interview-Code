package ImmutableHashMap;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args)
    {
		Map m1=new HashMap();
		Account a1=new Account(1);
		a1.setHolderName("Ritesh");
		
		Account a2=new Account(2);
		a2.setHolderName("Kumar");
		
		m1.put(a1, a1.getHolderName());
		m1.put(a2, a2.getHolderName());
		
		a1.setHolderName("Vijay");
		a2.setHolderName("Vivek");
		
		System.out.println(a1.getHolderName());
		
		}
    }
