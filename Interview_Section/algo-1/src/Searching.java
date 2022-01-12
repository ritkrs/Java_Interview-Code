
/**
 * @author Ritesh
 *
 */
public class Searching {
	public static int linearSearch(int[] arr,int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				return i;
			}

		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int key=50;
		int result=linearSearch(arr,7);
		if(result==-1)
		{
			System.out.println("Element is not presnt");
		}
		else
		{
			System.out.println("Element is present "+key);
		}
	}

}
