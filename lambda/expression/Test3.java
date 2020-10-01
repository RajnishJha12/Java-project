package com.lambda.expression;
/* Write a LE which will print Hello World to the console */

interface Interf3
{
	public void m1();
}

public class Test3 {

	public static void main(String[] args) {
		Interf3 i = ()->System.out.println("Hello World!");
		i.m1();

	}

}
