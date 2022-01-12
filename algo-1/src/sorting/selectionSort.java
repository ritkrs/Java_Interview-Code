/**
 * 
 */
package sorting;

/**
 * @Ritesh
 *
 */
public class selectionSort {
	public static void selectionSort(int[] arr)
	{
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<arr.length-1;j++)
			{
				if(arr[j]<arr[minIndex])
				{
					minIndex=j;
				}
			}
			 temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
			
		}
	}
	public static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr= {7,3,98,43,53,90,54};
		selectionSort(arr);
		printArray(arr);
		
	}

}
