package comparator1;

import java.util.ArrayList;
import java.util.Collections;

public class CustomSorting {
	//Sorting Arraylist based on Name and id.
	public static void main(String[] args) {
		ArrayList<Employee> a1=new ArrayList<Employee>();
		a1.add(new Employee("ritesh","kumar",1));
		a1.add(new Employee("vijay","kumar",3));
		a1.add(new Employee("ajay","kumar",2));
		a1.add(new Employee("sanjay","kumar",4));
		Collections.sort(a1,new MyComparator());
		System.out.println("This is custom sorting based on firstName");
		for (int i = 0; i < a1.size(); i++) {
			
			System.out.println(a1.get(i));
		}
	}

}
