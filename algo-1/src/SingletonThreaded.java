
public class SingletonThreaded {
	private static SingletonThreaded instance=null;
	private SingletonThreaded()
	{
	}
	public static SingletonThreaded getInstance()
	{
	if(instance==null)
	{
			synchronized (SingletonThreaded.class) {
				if(instance==null)
				{
					
					instance=new SingletonThreaded();
				}
				
			}
		}
		System.out.println("Singleton created");
		return instance;
		
	}
	
}
