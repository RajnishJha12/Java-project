package com.lambda.expression;

public class RunnableDemo2 {

	public static void main(String[] args) {
		Runnable r = new Runnable() //Here I'm writing AIC inside a main() method that implements Runnable interface. In this class I'm providing implementation for run() method. 
				{
			       public void run()
			       {
			    	   for(int i=0;i<10;i++)
			    	   {
			    		   System.out.println("Child Thread");
			    	   }
			       }
				};
				//For this implemented class I'm creating an object called new Runnable(). This object is the object of its implementation class and not the object of Runnable interface.
				Thread t = new Thread(r);
				t.start();
				
				for(int i=0;i<10;i++)
				{
					System.out.println("Main Thread");
				}
	}

}
