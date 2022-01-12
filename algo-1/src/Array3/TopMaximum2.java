package Array3;

import java.util.ArrayList;
import java.util.List;

public class TopMaximum2 {
	
	public static void topMaxi(int[] arr)
	{
		int topMax=arr[0];
		int secondTop=topMax;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>topMax)
			{
				topMax=arr[i];
			}
			else if(topMax<secondTop) {
				secondTop=topMax;
				
			}
		}
		System.out.println(secondTop);
		System.out.println(topMax);
		
}
	
	public static void main(String[] args) {
		int[] arr= {23,45,67,89,90,67,54,32,40};
		topMaxi(arr);
	}

}
