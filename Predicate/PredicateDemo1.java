package com.Predicate;

import java.util.Scanner;
import java.util.function.Predicate;

/*WAP to check whether the given number is greater than 10 or not and to check whether the given number is even or not and check whether the length of the  given string is greater than 5 or not ? */

class Predicate1
{
	public static void m1(Predicate<Integer> p, int num)
	{
	
		System.out.println(p.test(num));    
	}
	

	public static void m2(Predicate<String> p, String str)
	{
	
		System.out.println(p.test(str));    
	}

}

public class PredicateDemo1 {

	public static void main(String[] args) {
		
		 System.out.println("Enter the number:");	
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 String str = sc.nextLine();
		
		
	    //Write a Predicate for this: This Predicate takes Integer as an argument. Here I is the input value and I>10 is the condition check.
		Predicate<Integer> p1 = i->i>10;
		Predicate<Integer> p2 = i->i%2 == 0;
		Predicate<String>  p3 = s->s.length()>5;
		
		System.out.println("Predicate > 10:");
		Predicate1.m1(p1, num);
		System.out.println();
		
		System.out.println("Predicate Not greater than 10. Negation:");
		Predicate1.m1(p1.negate(), num);
		System.out.println();
		
		System.out.println("Predicate Even Number:");
		Predicate1.m1(p2, num);
		System.out.println();
		
		System.out.println("Predicate >10 AND Even Number:");
		Predicate1.m1(p1.and(p2), num);
		System.out.println();
		
		System.out.println("Predicate >10 OR Even Number:");
		Predicate1.m1(p1.or(p2), num);
		System.out.println();
		
		sc.close();
	
	}

}
