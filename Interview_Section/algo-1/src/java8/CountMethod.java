/**
 * 
 */
package java8;

import java.util.ArrayList;

/**
 * @author pc
 *
 */
public class CountMethod {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("abc");
		a1.add("def");
		a1.add("ghi");
		a1.add("jkl");
		a1.add("mno");
		a1.add("abc");
		
		long count =a1.stream().filter(s ->s.length()==5).count();
		System.out.println("The no of 5 length string is"+count);
		
		
		long a2=a1.stream().filter(s-> s.length()==5).count();
		System.out.println(a2);
	}

}
