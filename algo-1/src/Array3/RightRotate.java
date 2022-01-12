package Array3;

public class RightRotate {
	public static void rightRotate(int[] arr)
	{
		int firstLast=arr[arr.length-1];
		int secondLast=arr[arr.length-2];
		int third=arr[0];
		int fourth=arr[1];
		System.out.println("secondLast"+secondLast);
		System.out.println("firstLast"+firstLast);
		for(int i=arr.length-1;i>1;i--)
		{
			arr[i]=arr[i-2];
		}
		arr[0]=firstLast;
		arr[1]=secondLast;
		
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8};
		rightRotate(arr);
		
	}

}
