package singleton;

public class Singleton {
	private static Singleton sn=new Singleton();
	private Singleton() {}
	public static Singleton getInstance()
	{
		return sn;
	}
	protected static void singletonDemo()
	{
		System.out.println("Singleton design pattern demo");
	}

}
