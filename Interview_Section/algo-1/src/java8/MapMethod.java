/**
 * 
 */
package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ritesh
 *
 */
public class MapMethod {
	public static void main(String[] args) {
		
	
	ArrayList<String> a1=new ArrayList<String>();
	a1.add("abc");
	a1.add("def");
	a1.add("ghi");
	a1.add("jkl");
	a1.add("mno");
	System.out.println(a1);
	List<String> l2=a1.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
	System.out.println(l2);
	
	}
}
