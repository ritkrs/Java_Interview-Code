package practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class EmployeeMain {
	
	
	public static void main(String[] args) {
		
//	Employee e1=new Employee(1,"Ritesh","kumar");
//	Employee e2=new Employee(2,"vijay","kumar");
//	Employee e3=new Employee(3,"sanjay","kumar");
//	Employee e4=new Employee(4,"Ajay","kumar");
	
	ArrayList<Employee> e5=new ArrayList<Employee>();
	e5.add(new Employee(5, "biltu", "kumar"));
	e5.add(new Employee(6, "santu", "kumar"));
	//e5.sort((Employee s1, Employee s2)->s2.getId()-s1.getId());
	// employees.sort(Comparator.comparing(e -> e.getLastName()));
	//e5.sort(Comparator.comparing(e -> e.g));
	for (int i = 0; i < e5.size(); i++) {
		System.out.print(e5.get(i));
		
	}
	
	
	

	}	
}
