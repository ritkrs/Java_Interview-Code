package practice;

public class TwoRightRotate {
	public void twoRightRotate(int[] arr)
	{
		int temp1=arr[arr.length-1];
		int temp2=arr[arr.length-2];
		for (int i = arr.length-1; i >1 ; i--) {
			arr[i]=arr[i-2];
			
		}
		arr[0]=temp1;
		arr[1]=temp2;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}
	}
	public static void main(String[] args) {
		TwoRightRotate tr=new TwoRightRotate();
		int[] arr= {1,2,3,4,5,6};
		tr.twoRightRotate(arr);
	}
}
