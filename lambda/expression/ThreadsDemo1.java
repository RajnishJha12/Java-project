package com.lambda.expression;

/* WAP to create a thread by extending Thread class */

class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child thread");
		}
	}
}

public class ThreadsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		t.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread");
		}

	}

}
