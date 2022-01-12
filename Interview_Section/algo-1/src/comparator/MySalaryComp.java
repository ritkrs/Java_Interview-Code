package comparator;

import java.util.Comparator;

class MySalaryComp implements Comparator<Empl>{

   //Sorting based on Salary(Integer)
//	@Override
//	public int compare(Empl o1, Empl o2) {
//		if(o1.getSalary()<o2.getSalary())
//		{
//			return -1;
//		}
//		else {
//			return 1;
//		}
//	}
//Sorting based on name(String.)
	@Override
	public int compare(Empl o1, Empl o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
	
	
}
