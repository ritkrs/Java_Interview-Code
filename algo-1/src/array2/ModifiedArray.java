package array2;

public class ModifiedArray {
	
	public void modArray(int[] arr,int newElements)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			newElements+=arr[i];
		}
	}

}
