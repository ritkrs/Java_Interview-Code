package array;

public class CheckArraySorted {
	public static boolean sortingChecking(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<arr[i+1])
			{
             return true;
            // System.out.print();
			}
			else {
             return false;
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,3};
		sortingChecking(arr);
	}
}
