package array2;

public class TwoSum {
	
	public int[] twoSum(int[] nums,int target)
	{
		//int n=nums.length;
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[j]==target)
				{
					return new int[] {i,j};
				}
			}
		}
		return nums;
		
		
	}

}
