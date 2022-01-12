package array;

public class CommonElements2Array {
	
	public static void main(String[] args) {
		
		int[] x= {1,2,3,4,5,6};
		int[] y= {7,8,9,4};
		for(int i=0;i<x.length;i++)
		
			for(int j=0;j<y.length;j++)
			{
				if(x[i]==x[j])
				{
					System.out.println(x[i]);
				}

					
			}
		
	}

}
