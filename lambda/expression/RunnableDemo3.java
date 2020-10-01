package com.lambda.expression;

class myRunnables
{
	public void m1() //Since m1() is the concrete method of myRunnable class. So compulsory  object needs to be created for myRunnable class in order to call m1() method.
	{
		Runnable r = new Runnable()
				{
			       public void run()
			       {
			    	   for(int i=0;i<10;i++)
			    	   {
			    		   System.out.println("Child Thread");
			    	   }
			       }

				};
				Thread t = new Thread(r);
				t.start();
	}
}
public class RunnableDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myRunnables x = new myRunnables();
		x.m1();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Therad");
		}
		

	}

}
