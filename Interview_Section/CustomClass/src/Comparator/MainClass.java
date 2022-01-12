package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<Employee> a1=new ArrayList<Employee>();
		a1.add(new Employee(2, "Ritesh", "kumar"));
		a1.add(new Employee(1, "Ajay", "kumar"));
		a1.add(new Employee(4, "Vijay", "kumar"));
		a1.add(new Employee(9, "Sanjay", "kumar"));
		a1.add(new Employee(3, "Mantu", "kumar"));
		
		//Sorting by Id
		Collections.sort(a1,new SortById());
		
		//Sorting by firstName
		Collections.sort(a1,new SortByName());
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
			
		}
	}

}
