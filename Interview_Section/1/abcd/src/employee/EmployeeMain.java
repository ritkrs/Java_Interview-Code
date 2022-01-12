package employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeMain {
	public static void main(String[] args) {
		Map m1=new HashMap();
		Employees e1=new Employees("Ritesh", "kumar", 10000);
		m1.put(e1, "1st entry");
		m1.put(new Employees("Vijay", "kumar", 2000), "2nd Entry");
		System.out.println(m1.size());
		
		Map m2=new HashMap();
		m2.put("ab", "bc");
		
		int hash=m1.hashCode();
		int hash2=m2.hashCode();
		System.out.println(hash);
		System.out.println("second hashmap "+hash2);
		
	//Converting Hasmap key into arraylist
		
		Set a1=m1.keySet();
		System.out.println(a1);
		ArrayList a2=new ArrayList(a1);
		System.out.println("Arraylist content"+a2);
		
		//Converting Hasmap value. into arraylist
		Collection a3=m1.values();
		System.out.println(a3);
		ArrayList a4=new ArrayList(a3);
		System.out.println(a4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
