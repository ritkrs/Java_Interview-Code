package practice;


public class ArrayContainsNo {
	
	
	public void isNo(int[] arr1)
	{
		int toFind=3;
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i]==toFind)
			{
				System.out.println("no is available="+toFind);
			}
			else if (arr1[i]!=toFind) {
				System.out.println(toFind+"=is not available in this arrays.");
				
			}
		}
	}
	public static void main(String[] args) {
		int[] arr1= {1,2,4,5,6,7};
		ArrayContainsNo ac=new ArrayContainsNo();
		ac.isNo(arr1);
	}
}
