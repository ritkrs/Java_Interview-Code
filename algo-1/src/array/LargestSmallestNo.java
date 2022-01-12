package array;

public class LargestSmallestNo {
	public void largestSmallest(int[] arr)
	{
		int largest=arr[0];
		int smallest=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>largest)
				largest=arr[i];
			else if (arr[i]<smallest) {
				smallest=arr[i];
				
			}
		}
		System.out.println("largest no is = " +largest);
		System.out.println("smallest no is = " +smallest);
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		LargestSmallestNo lm=new LargestSmallestNo();
		lm.largestSmallest(arr);
	}
}
