package sorting;

public class BubbleSort {
	
	//
	public static void bubbleSort(int[] arr)
	{
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}
	public static void printArray(int[] arr)
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr= {4,8,42,78,65,35,54,54};
		bubbleSort(arr);
		printArray(arr);
	}

}
