package com.lambda.expression;

import java.util.ArrayList;
import java.util.List;

class LE1
{
	public List<Integer> m1()
	{
		List<Integer> list = new ArrayList<Integer> ();
		list.add(1);
		list.add(2);
		list.add(3);
		
		//list.forEach(obj->System.out.println(obj));
		
		list.forEach(obj->{
			if(2==obj){
				System.out.println(obj);
			}
		});
		return list;
		
		
		}
	}

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LE1 le = new LE1();
		le.m1();
	}

}
