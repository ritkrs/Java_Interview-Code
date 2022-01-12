package singleton2;

public class Singleton {
	private static Singleton sn=null;
	private Singleton(){}
	public static Singleton getInstance()
	{
		if (sn==null) {
			sn=new Singleton();
		}
		return sn;
	}
	protected static void singletonDemo()
	{
		System.out.println("2nd approaches of Singleton");
	}
	

}
