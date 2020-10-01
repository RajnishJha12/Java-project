package com.lambda.expression;
/* Write a LE which takes two int values as an arguments and print the sum of two numbers. */

interface Interf4
{
	public void add(int a, int b);
}

public class Test4 {

	public static void main(String[] args) {
		
		Interf4 i = (a,b)->System.out.println("Sum="+ (a+b));
		i.add(10, 20);
		i.add(100, 200);

	}

}
