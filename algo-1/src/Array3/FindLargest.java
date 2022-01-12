package Array3;

public class FindLargest {
	
	public void largestSmallest(int[] arr)
	{
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
				System.out.println();
			}
			else if (arr[i]<smallest) {
				smallest=arr[i];
				
			}
		}
		System.out.println(largest);
		System.out.println(smallest);
		
	}
	public static void main(String[] args) {
		int[] arr= {11,2,3,4,5,6};
		FindLargest fl=new FindLargest();
		fl.largestSmallest(arr);

	}

}
