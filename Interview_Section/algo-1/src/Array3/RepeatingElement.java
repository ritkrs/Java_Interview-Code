package Array3;

public class RepeatingElement {
	
	public void findRepeat(int[] arr)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,5,6};
		RepeatingElement re=new RepeatingElement();
		re.findRepeat(arr);
	}
}
