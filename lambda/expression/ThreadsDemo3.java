package com.lambda.expression;

/* WAP to create a thread by extending Thread class by using Anonymous Inner Class */

public class ThreadsDemo3 {
	
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

	
	public static void main(String[] args) {
		ThreadsDemo3 t2 = new ThreadsDemo3();
		t2.m1();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread");
		}		
		
	}
}



		
	


