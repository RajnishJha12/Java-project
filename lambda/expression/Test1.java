package com.lambda.expression;

interface Interf1
{
	public void m1(); //Every methods inside an interface is by default public and abstract only. Whether we are declaring it or not.
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interf1 i = () -> System.out.println("Lambda Expression implementation");
		i.m1();

	}

}
