/**
 * 
 */
package sorting;

/**
 * @author pc
 *
 */
public class BubbleSort1 {
	public static void bubbleSort(int[] arr)
	{
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					 temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
				}
			}
		}
	}
	public static void printArray(int[] arr)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr= {4,8,42,78,65,35,54,54};
		bubbleSort(arr);
		printArray(arr);
		System.out.println("Ritesh");
	}

}
