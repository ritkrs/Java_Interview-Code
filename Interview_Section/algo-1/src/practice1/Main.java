package practice1;

import java.util.ArrayList;

class Main{	
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("ab");
		a1.add("bc");
		a1.add("cd");
		a1.add("ef");
		a1.add("gh");
		a1.add("ij");
		for (int i = 0; i < a1.size(); i++) {
			System.out.print(a1.get(i)+" ");
			
		}
		
	}
}
