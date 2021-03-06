package interview1;

public class ArrayHighest {
	
	public static void sort(int[] arr)
	{
		
		int n=arr.length;
		for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[j] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
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
		int[] arr= {5,3,78,67,50,34,89};
		ArrayHighest ah=new ArrayHighest();
		ah.sort(arr);
		System.out.println("Sorted Array");
		ah.printArray(arr);
		
	}
	

}
