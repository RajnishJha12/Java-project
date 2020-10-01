package com.Predicate;

import java.util.function.Predicate;

class Predicate3
{
	//Example of Predicate into a function: 
	public static void pred(Predicate<Integer> p, int num) 
	{ 
		if (p.test(num)) 
		{ 
	       System.out.println("Number " + num); 
	    } 
	} 
	 
}

public class PredicateDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Simple Predicate Example:");
		// Creating predicate 
        Predicate<Integer> p = i -> (i < 18);  
  
        // Calling Predicate method 
        System.out.println(p.test(10));  
        
        //Java program to illustrate Predicate Chaining:
        System.out.println("Predicate Chaining or Joing Example:");
        Predicate<Integer> greaterThanTen = (i) -> i > 10; 
        Predicate<Integer> lowerThanTwenty = (i) -> i < 20;  
        
        boolean result = greaterThanTen.and(lowerThanTwenty).test(15); 
        System.out.println(result); 
  
        // Calling Predicate method 
        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15); 
        System.out.println(result2); 
        
        Predicate3.pred((i)->i>7, 10);

	}

}
