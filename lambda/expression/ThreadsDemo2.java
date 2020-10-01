package com.lambda.expression;

/* WAP to create a thread by extending Thread class by using Anonymous Inner Class */


public class ThreadsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
				
				for(int i=0;i<10;i++)
		    	  {
		    		  System.out.println("Main thread");
		    	  }
				

	}

}
