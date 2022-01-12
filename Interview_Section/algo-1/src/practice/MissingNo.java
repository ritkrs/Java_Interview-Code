package practice;

public class MissingNo {
	public void missingNo(int[] arr)
	{
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		int missingNo;
		int restSum=0;
		for(int i=0;i<arr.length;i++)
		{
			restSum+=arr[i];
		}
		missingNo=sum-restSum;
		System.out.println(missingNo);
		
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12,13,15,16,17,18};
		MissingNo mn=new MissingNo();
		mn.missingNo(arr);
	}

}
