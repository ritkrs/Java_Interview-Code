package Array3;

public class MissingNo1 {
	public static void missing(int[] arr)
	{
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		int restSum=0;
		for(int i=0;i<arr.length;i++)
		{
			restSum=restSum+arr[i];
		}
		int missingNo=sum-restSum;
		System.out.println(missingNo);
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,6,7,8};
		missing(arr);
	}

}
