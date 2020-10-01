package com.Predicate;

import java.util.function.Predicate;

//Write Predicate using Anonymous class:

class Predicate5
{
	public static void m1()
	{
		Predicate<String> p = new Predicate<String> ()
				{
			       public boolean test(String s)
			       {
			    	   return s.length()>5;
			    	   
			       }
			
				};
	}
	    
}

public class PredicateDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		Predicate5.m1();

	}

}
