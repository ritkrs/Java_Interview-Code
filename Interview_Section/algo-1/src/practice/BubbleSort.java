package practice;

public class BubbleSort {
	public void bubble(int[] arr)
	{
		int temp;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;	
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}

		System.out.println("This is largest no="+arr[arr.length-1]);
		System.out.println("This is smallest no="+arr[0]);
	}
	public static void main(String[] args) {
		BubbleSort bs=new BubbleSort();
		int[] arr= {2,5,3,1,9,4};
		bs.bubble(arr);
	}

}
