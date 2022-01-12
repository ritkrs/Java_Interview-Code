

package Array3;

public class MissingNo {
	
	
	
	public static int missNo(int arr[])
	{
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		int restSum=0;
		for(int i=0;i<arr.length;i++)
		{
			restSum+=arr[i];
		}
		int missingNo=sum-restSum;
		return missingNo;
		
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,7};
		System.out.println(missNo(arr));
	}

}
