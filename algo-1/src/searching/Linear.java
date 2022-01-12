package searching;

public class Linear {
	public static boolean linear(int[] arr,int y)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]== y)
			{
				return true;
			}
			
		}
		//System.out.println("elements not found");
		return false;	
			
		
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12};
		int y=11;
		linear(arr, y);
	}

}
