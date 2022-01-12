package ABABABA;

class SynchronizedDemo
{ 
	public static void main(String[] args)
	{  
		Display d1=new Display(); 
		MyThread t1=new MyThread(d1,"A"); 
		MyThread t2=new MyThread(d1,"B");
  t1.start();  
  t2.start(); 
  } 
	} 