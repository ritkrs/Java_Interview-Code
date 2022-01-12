package Array3;
//Find integer from arrays
public class FindInt {
	
	public static boolean findInteger(int[] arr)
	{
		int toFind=8;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==toFind)
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,4,5,6};
		System.out.println(findInteger(arr));
	}

}
