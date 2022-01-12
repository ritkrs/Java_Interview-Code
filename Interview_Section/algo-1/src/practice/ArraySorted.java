package practice;

public class ArraySorted {
	
	public void sortdeOrNot(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j])
				{
					System.out.println("Array is sorted");
				}
				else {
					System.out.println("Array is not sorted");
				}
				
			}
		}
	}
	public static void main(String[] args) {
		ArraySorted as=new ArraySorted();
		int[] arr= {1,2,3,4,5,6,7};
		as.sortdeOrNot(arr);
	}

}
