package com.Default.mothod;

interface Interf1
{
	default  void m1()
	{
		System.out.println("Default method");
	}
}

abstract class demo
{
	public void m1()
	{
		
	}

	
}

public class Test1 implements Interf1{
	
	public static void main(String[] args) {
		Test1  t = new Test1();
		t.m1();
		
		

	}

}
