package Array3;

public class ReverseArray {
	
	public static void reverse(int[] arr)
	{
		int rev=0;
		for(int i=arr.length-1;i>=1;i--)
		{
			System.out.println(arr[i]);
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		reverse(arr);
	}

}
