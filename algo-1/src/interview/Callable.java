/**
 * 
 */
package interview;

import java.util.concurrent.FutureTask;

/**
 * @author pc
 *
 */
public class Callable  implements java.util.concurrent.Callable{

	@Override
	public Object call() throws Exception {
		 String s1=Thread.currentThread().getName();

		System.out.println(s1);
		return s1;
		
	}
	public class CallableMain
	{
		public  void main(String[] args) throws Exception {
			FutureTask[] t1=new FutureTask[5];
			for(int i=0;i<5;i++)
			{
				CallableMain c1=new CallableMain();
				Thread t2=new Thread(t1[i]);
				t2.start();
			}
			for(int i=0;i<5;i++)
			{
				System.out.println(t1[i].get());
			}
			
		}
	}
	

}
