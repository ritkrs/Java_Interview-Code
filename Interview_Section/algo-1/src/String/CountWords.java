package String;

public class CountWords {
	
//	public static  void countword(String str)
//	{
//		int count=0;
//		for(int i=0;i<=str.length()-1;i++)
//		{
//			if(str.charAt(i) == ' ')
//			{
//				count++;
//			}
//		}
//		count=count+1;
//		System.out.println(count);
//		
//	}
	public static void count_Words(String str)
    {
       int count = 0;
//        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
//        {
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == ' ')
                {
                    count++;
                }
            }
            count = count + 1; 
       System.out.println(count);
    }
 
	public static void main(String[] args) {
		String str="Hello how are you ritesh ji";
		count_Words(str);
		
	}

}
