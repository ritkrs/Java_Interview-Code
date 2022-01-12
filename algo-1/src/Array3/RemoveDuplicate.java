package Array3;

import java.util.ArrayList;

public class RemoveDuplicate { 

	public static void removeDup(int[] arr)
	{
		int end=arr.length;
		for(int i=0;i<end;i++)
		{
			for(int j=i+1;j<end;j++)
			{
				if(arr[i]==arr[j])
				{
					int shiftLeft=j;
					for(int k=j+1;j<end;j++)
					{
						arr[shiftLeft]=arr[k];
					}
					end--;
					j--;
				}
			}
		}
		int[] arr1=new int[end];
		for(int i=0;i<end;i++)
		{
			arr1[i]=arr[i];
		}
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]+",");
		}
	}
	public static void creareNewArray(int[] arr3,int[] arr4)
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		for(int i=0;i<arr3.length;i++)
		{
			for(int j=0;j<arr4.length;j++)
			{
				if(arr3[i]==arr4[j])
				{
					a1.add(arr3[i]);
					
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr3= {1,2,3,4,5,6,8,9};
		int[] arr4= {1,2,3,10,11,12,13,14,15,16,17,18};
		
	}

}
