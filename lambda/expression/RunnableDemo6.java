package com.lambda.expression;

class Y
{
	public void m1()
	{
		Thread t =new Thread(()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("child thread");
			}
		}
		
		);
		t.start();
	
	}
}

public class RunnableDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Y y = new Y();
		y.m1();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread");
		}
		

	}

}
