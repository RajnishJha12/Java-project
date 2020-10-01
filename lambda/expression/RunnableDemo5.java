package com.lambda.expression;

class X
{
	public static  void m1()
	{
		Runnable r = ()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("Child thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
	}
	
}

public class RunnableDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x = new X();
		X.m1();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread");
		}

	}

}
