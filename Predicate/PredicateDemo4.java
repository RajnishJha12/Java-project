package com.Predicate;

import java.util.ArrayList;
import java.util.List;

//Example of Predicate using Collection: WAP to finds all admins in an arrayList of users. 

import java.util.function.Predicate; 

class User 
{ 
    String name;
    String role; 
    public User(String name, String role) 
    { 
        this.name = name; 
        this.role = role; 
    } 
    String getRole() 
    { 
    	return this.role; 
    } 
    String getName() 
    { 
    	return this.name; 
    }     
    
    public String toString() 
    { 
       return "User Name : " + name + ", Role :" + role; 
    } 
  
    
  
    public static List<User> process(Predicate<User> p, List<User> users) 
    { 
        List<User> al = new ArrayList<User>(); 
        for (User user: users)     
        {
        	if (p.test(user))             
                al.add(user); 
        }
            
        return al; 
    } 
} 


public class PredicateDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List <User> users = new ArrayList<User>(); 
	        users.add(new User("John", "admin")); 
	        users.add(new User("Peter", "member")); 
	        List<User> admins = User.process((User u) -> u.getRole().equals("admin"), users); 
	        System.out.println(admins); 
	    } 

	}


