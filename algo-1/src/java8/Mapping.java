package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Mapping {
	public static void main(String[] args) {
		ArrayList<String> s1=new ArrayList<String>();
		s1.add("ab");
		s1.add("cd");
		s1.add("ef");
		s1.add("gh");
		s1.add("ij");
		s1.add("kl");
		System.out.println(s1);
		List<String> l2=s1.stream().map(s3->s3.toUpperCase()).collect(Collectors.toList());
		System.out.println(l2);
	}
	
	

}
