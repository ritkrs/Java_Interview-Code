/**
 * 
 */
package sorting;

/**
 * @author pc
 *
 */
public class SelectionSort1 {
	public static void selectionSort(int[] arr)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<arr.length-1;i++)
			{
				if(arr[j]<arr[minIndex])
				{
					minIndex=j;
				}
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
	}
	public static void printArray(int[] arr)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr= {67,43,21,90,87,24};
         selectionSort(arr);
		printArray(arr);
		
	}

}
