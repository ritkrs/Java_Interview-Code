package abcd;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	 public static void main(String[] args) {
		 ArrayList<String> l3=new ArrayList<String>();
		 l3.add("ab");
		 l3.add("bc");
		 l3.add("cd");
		 l3.add("de");
		 l3.add("ef");
		 List<String> l4=l3.stream().map(m1->m1.toUpperCase()).collect(Collectors.toList());
		 System.out.println(l4);
		 long l=l4.stream().filter(f->f.length()==5).count();
		 System.out.println(l);
	 }   
}
