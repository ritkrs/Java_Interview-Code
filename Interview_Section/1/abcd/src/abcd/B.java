package abcd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class B {
	public static void main(String[] args) {
		List l1=new ArrayList<Emploee>();
		Emploee a1=new Emploee("ab", 1, l1);
		Emploee a2=new Emploee("bc", 2, l1);		
		Emploee a3=new Emploee("cd", 3, l1);		
		l1.add(a1);
		l1.add(a2);
		l1.add(a3);
		Collections.sort(l1,new SortByName());
		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
			
		}
		
	}
	
}
