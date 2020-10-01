package com.lambda.expression;
/* Write a LE which takes String as an argument that returns the length of that given String. */

interface Interf5
{
	public int getLength(String s);
}
public class Test5 {

	public static void main(String[] args) {
		
		Interf5 i = (s) -> s.length();
		//int result = i.getLength("Hello");
		//System.out.println(result);
		System.out.println(i.getLength("Hello"));
		System.out.println(i.getLength("Hi"));

	}

}
