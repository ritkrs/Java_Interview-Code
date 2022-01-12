package Array3;

public class FindIndex {
	
	public static void findIndex(int[] arr)
	{
		int element=5;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==element)
			{
				System.out.println(arr[i]-1);
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		findIndex(arr);
	}

}
