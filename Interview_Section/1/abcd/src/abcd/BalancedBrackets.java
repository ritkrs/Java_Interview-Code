package abcd;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {
	
	static boolean checkBalanced(String expr)
	{
		Deque<Character> s1=new ArrayDeque<Character>(); {
			for (int i = 0; i < expr.length(); i++) {
				char x=expr.charAt(i);
				if (x=='{' || x=='}') {
					s1.push(x);
					continue;
					
				}
				if (s1.isEmpty()) 
					return false;
				char check;
				switch (x) {
				case '{': {
					check=s1.pop();
					if (check=='{' || check=='}') {
						return true;
						
						
					}
	
				}
				case '}':
				check=s1.pop();
				if (check=='}') {
					return true;
					
					
					
				}
				
			}
		}
		
		return (s1.isEmpty());
	}

}
	public static void main(String[] args) {
		String expr="{}";
		if (checkBalanced(expr)) {
			System.out.println("true");
			
		}
		else {
			System.out.println("false");
		}
		
	}
}
