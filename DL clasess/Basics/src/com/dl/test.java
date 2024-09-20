package com.dl;

import java.util.ArrayList;
import java.util.List;

public class test {
	
	// Class - Class is a blueprint or a template
	// class contains variables,methods, blocks and constructors
	// We have user-defined classes and build in classes  
	
	// Object - Object is instance of a class
	
	// Variables - Variables holds the value and store the value
    
	// Package - Package contains business logic
	// we have user-defined packages and build in packages
	// in package we have classes and interfaces etc..
	 
	public static void main(String[] args) {
		System.out.println("Hello World");
	
		
		// Data types -8: byte,short,int,long,float,double,boolean, char
		// Prepare some data : Dell Product
		// Data types:
		int productId = 456789;
		double productCost = 40000.00;
		float screensize = 15.6f;
		long productserialNo = 6789654320l;
		boolean productAvailable = true;
		
		//Classes
		String productName = "Dell";
		String productItems [] = {"item1", "item2", "item3"};
		
		//Classes and Interfaces
		
		List<String> list = new ArrayList<String>();
		list.add("item1");
		list.add("item2");
		list.add("item3");
		
		 // Wrapper Classes:
		 Byte b;
		 Short s;
		 Integer i;
		 Long l;
		 Float f;
		 Double d;
		 Character ch;
		 Boolean bb;
		 
		
		
		// Types of literals
		int a = 10;
		// int is data type
		// a is variable
		// = is operator
		// ; separtor( end of the line)
		
		//Integer
		int aa = 10;
		System.out.println(aa);//10
		
		//Binary : b is binary prefix, base is 2 (0 to 1)
		int aaa = 010101;
		System.out.println(aaa);//4161
		
		//Hexa : ox is a prefix, base is 16(a to f , 0 to 9)
		int aaaa = 0xfe23;
		System.out.println(aaaa);// 65059
		
		// octal is 0, base is 8 0 to 7)
		int aaaaa = 0234;
		System.out.println(aaaaa);// 156
		
		// Default value;
	
	}
	
	
}
