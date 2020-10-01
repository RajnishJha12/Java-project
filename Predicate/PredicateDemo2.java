package com.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/*WAP to check whether the given collection is Empty or not?*/

class Predicate2
{
	/*
	public static Predicate<ArrayList> isEmpty()
	{
	    return p -> p.isEmpty();
	}
	*/
	
	public static void m1(Predicate<ArrayList> p, ArrayList al)
	{
	
		System.out.println(p.test(al));    
	}
	
}

public class PredicateDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();

		Predicate<ArrayList> p1 = c->c.isEmpty();
		//al.add("A");
		
		
		Predicate2.m1(p1,al);
		//System.out.println(Predicate2.isEmpty()); 
	
	
		

	}

}
