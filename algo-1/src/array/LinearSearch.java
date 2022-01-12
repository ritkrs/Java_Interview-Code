package array;

public class LinearSearch {
	public static void main(String[] args) {
		int[] x= {1,2,3,4,5,6};
		int i=search(x,23);
		System.out.println(i);	
	}

	private static int search(int[] x, int i) {

		int index=-1;
		for(int j=0;j<x.length;i++)
		{
			if(x[i]==i)
			{
				index=i;
				break;
			}
		}
		return index;
	
		
	}

}
