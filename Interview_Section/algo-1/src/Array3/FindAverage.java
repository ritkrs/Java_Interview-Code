package Array3;

public class FindAverage {
	
	public static void average(int[] arr)
	{
		int sum=0;
		int count=0;
		int avg;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			count++;
		}
		avg=sum/count;
		System.out.println(avg);
		System.out.println(count);
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		average(arr);
	}

}
