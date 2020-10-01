package com.lambda.expression;

/* WAP to create a thread by implementing Runnable interface */

class MyRunnable implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
		}
	}
}

public class RunnableDemo1 {

	public static void main(String[] args) {
		Runnable r = new MyRunnable();
		//MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}

	}

}
