package array2;

class SubarraySum 
{
	int subArray(int[] arr,int n,int sum)
	{
		int currentSum=0;
		for(int i=0;i<=arr.length;i++)
		{
			currentSum=arr[i];
			for(int j=i+1;j<=arr.length;j++)
			{
				if(currentSum==sum)
				{
					int p=j-1;
					System.out.println("sum found beteen indexes"+i+"and"+p);
				}
			}
		}
		
		return 10;
	}
	
} 
  
// This code has been contributed by Mayank Jaiswal(mayank_24) 
