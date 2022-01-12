package array2;

public class FindIndex {
	public int returnIndex(int[] arr,int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				System.out.println(i);
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		FindIndex fi=new FindIndex();
		int[] arr= {1,2,3,4,5};
		int target=3;
		fi.returnIndex(arr, target);
	}
	

}
