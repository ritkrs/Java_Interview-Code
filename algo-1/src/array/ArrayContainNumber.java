package array;

public class ArrayContainNumber {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		int toFind=3;
		boolean found=false;
		for(int n:arr)
		{
			if(n==toFind)
			{
				found=true;
				break;
			}}
			if(found)
			{
				System.out.println(toFind+"to find");
			}
			else
			{
				System.out.println("not found the number"+toFind);
			}
		}
}


