package array2;

public class ReverseArray {
	
	public void reverseArray(int[] arr)
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
	}
	public static void main(String[] args) {
		ReverseArray ra=new ReverseArray();
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
		ra.reverseArray(arr);
	}

}
