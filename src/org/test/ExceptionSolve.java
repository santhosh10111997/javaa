package org.test;

import java.util.LinkedList;
import java.util.List;

public class ExceptionSolve {
public static void main(String[] args) {
	
//try-catch
	//try..except the error
	//caugh..solution
	
    //arithmeticexception
//	System.out.println(1);
//	System.out.println(2);
//	System.out.println(3);
//	try {
//	System.out.println(4/0);
//	}
//	catch(ArithmeticException ex) {
//		System.out.println("dont/0");
//	}
//	System.out.println(5);

	
	
//	System.out.println("start.......");
//	System.out.println(3);
//	try {
//	System.out.println(4/0);
//	}
//	catch(NullPointerException ex) {
//		System.out.println("dont/0");
//	}
//	System.out.println("end...........");
//	
	
	

//	System.out.println("start.......");
//	System.out.println(3);
//	try {
//	System.out.println(4/0);
//	}
//	catch(Exception ex) {
//		System.out.println("dont/0");
//		ex.printStackTrace();//knoen the exception
//	}
//	System.out.println("end...........");

	
	//try catch&finally 
	

//	System.out.println("start.......");
//	System.out.println(3);
//	try {
//	System.out.println(4/0);
//	}
//	catch(Exception ex) {
//		System.out.println("dont/0");
//	}
//	finally {
//		System.out.println("im a finally");
//		
//	}
//	System.out.println("end...........");
//	
	
	//try - finally
	
//	System.out.println("start.......");
//	System.out.println(3);
//	try {
//	String s=null;
//	System.out.println(s.length());
//	}
//	
//	finally {
//		System.out.println("im a finally");
//		
//	}
//	System.out.println("end...........");

	
//	try with multiple cautch
	
	
//	try {
//		int a[]=new int[2];
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
//		System.out.println(a[4]);
//	}
//	catch(Exception ex) {
//		System.out.println("all handler");
//	}
//	
//	catch(NullPointerException ex) {
//		System.out.println("Null");
//		
//	}
//	catch(StringIndexOutOfBoundsException ex) {
//		System.out.println("Null a");
//	}
//	catch(ArrayIndexOutOfBoundsException ex) {
//		System.out.println("Null b");
//	}
//	
	
		
		

	//try with try
	
	System.out.println("....start....");
	
	try {
		List<Integer> li=new LinkedList();
		li.add(10);
		System.out.println(li.get(0));
		try {
			String s= "hi";
			System.out.println(s.charAt(3));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("i am a inner catch");
		}
		finally {
			System.out.println("i am inner finally");
		}
}
	catch(IndexOutOfBoundsException e) {
	
	System.out.println("i am a outer catch");
	}
	finally {
		System.out.println("i am outer finally");
	}
	System.out.println("......end.......");
	
	
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
}
