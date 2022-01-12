package Oops;

public class Singleton {
	private static Singleton s1=new Singleton();
	private Singleton()
	{
		
	}
	private static Singleton getTest()
	{
		return s1;
	}

}
