package array;

public class TopMaximumNumber {
	public void topTwoMax(int[] nums)
	{
		int maxOne=0;
		int maxTwo=0;
		for(int n:nums)
			if(n>maxOne)
			{
				maxOne=n;
			}
		else if (n>maxTwo) {
			maxTwo=n;
			
		}
		System.out.println("first top maximum no"+maxOne);
		System.out.println("first top maximum no"+maxTwo);
		}
	public static void main(String[] args) {
		int [] nums= {1,2,3,4,5};
		 TopMaximumNumber tm=new TopMaximumNumber();
		 tm.topTwoMax(nums);
	}
		
	}

