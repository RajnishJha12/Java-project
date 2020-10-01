package com.lambda.expression;

public class RunnableDemo4 {
	
	public void m1()
	{
		Runnable r = new Runnable()
				{
			      public void run()
			      {
			    	  System.out.println("Child thread");
			      }
				};
				Thread t = new Thread(r);
				t.start();
	}

	public static void main(String[] args) {
		//Since m1() is the concrete method of this class so compulsory object of this class needs to be created to invoke m1() method.
		RunnableDemo4 x = new RunnableDemo4();
		x.m1();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread");
		}
		
	}

}
