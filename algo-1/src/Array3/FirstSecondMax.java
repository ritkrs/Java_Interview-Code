package Array3;

import java.util.Arrays;

public class FirstSecondMax {
	
	public static void firstSecondMaxi(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
	}
		System.out.println("After sorting elements are="+Arrays.toString(arr));
		System.out.println("first highest element= "+arr[arr.length-1]);
	    System.out.println("Second highest element= "+arr[arr.length-2]);
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,7,8,4,5,6,};
		firstSecondMaxi(arr);
	}

}
