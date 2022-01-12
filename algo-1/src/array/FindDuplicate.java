package array;

public class FindDuplicate {
	 public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6,3,4};
	int end=arr.length;
	for(int i=0;i<end;i++)
	{
		for(int j=i+1;j<end;j++)
		{
			if(arr[i]==arr[j])
			{
				System.out.println(arr[i]);
			}
		}
	}
         
        	  
	
}
}
