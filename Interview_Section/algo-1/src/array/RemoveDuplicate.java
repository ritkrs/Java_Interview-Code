package array;

public class RemoveDuplicate {
	public static void remDup(int[] x)
	{
		int end=x.length;
		for(int i=0;i<end;i++)
		{
			for(int j=i+1;j<end;j++)
			{
				if(x[i]==x[j])
				{
					int shiftLeft=j;
					for(int k=j+1;k<end;k++)
					{
						x[shiftLeft]=x[k];
					}
					end--;
					j--;
				}
			}
		}
		int[] y=new int[end];
		for(int i=0;i<end;i++)
		{
			y[i]=x[i];
		}
		for(int i=0;i<y.length;i++)
		{
			System.out.println(y[i]+ ",");
		}
	
	}
	public static void main(String[] args) {
		int[] x= {1,2,3,4,5,3,4};
		remDup(x);
		
	}

}
