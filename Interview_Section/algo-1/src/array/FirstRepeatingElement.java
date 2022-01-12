package array;

import java.util.HashSet;

public class FirstRepeatingElement {
	static void printFirstRepeating(int[] arr)
	{
		int min=-1;
		HashSet<Integer> h1=new HashSet<Integer>();
		for (int i=0;i<=arr.length-1;i++) {
			if(h1.contains(arr[i]))
			{
				min=i;
			}
			else {
				h1.add(arr[i]);
			}
			if(min !=-1)
			{
				System.out.println("first element is"+arr[min]);
			}
			else {
				System.out.println("There is no repeating element");
			}
			
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,3,4,5};
		FirstRepeatingElement f1=new FirstRepeatingElement();
		f1.printFirstRepeating(arr);
	}

}
