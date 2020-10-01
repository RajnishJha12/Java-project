package com.lambda.expression;

class myThreads
{
	public void m1()
	{
		Thread t = new Thread() 
				{
			         public void run()
			         {
			        	 for(int i=0;i<10;i++)
			        	 {
			        		 System.out.println("Child thread");
			        	 }
			         }
				};
				t.start();
	}
}

public class ThreadsDemo4 {

	public static void main(String[] args) {
		myThreads t2 = new myThreads();
		t2.m1();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread");
		}

	}

}
