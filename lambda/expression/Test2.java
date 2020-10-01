package com.lambda.expression;

interface Interf2
{
	public void m1();
}

class Demo implements Interf2
{
	public void m1()
	{
		System.out.println("Normal Implementation ");
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interf2 i = new Demo(); //interface reference variable can be used to hold object of its implementation class. This is Polymorphism.
        i.m1();
	}

}
