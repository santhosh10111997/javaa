package org.test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class ExceptionManoj {

	public static void product() throws ProductNotFoundException {
		Scanner s=new Scanner(System.in);
	System.out.println("enter the product name");
	String sr = s.next();
	if(sr.equals("oneplus")) {
		System.out.println("product available");
	}
	else {
		System.out.println("product not available");
		//NullPointerException e=new NullPointerException();
		throw new ProductNotFoundException();	
	}
	
	System.out.println("end");
	}
	public static void main(String[] args) throws ProductNotFoundException {
		try {
		product();
	}
	catch(ProductNotFoundException e) {
		System.out.println("handle");
		e.printStackTrace(); //print only the unknown exception name
		
	String mg = e.getMessage();	
	//System.out.println(mg);
	System.err.println(mg);
	}
		finally {
			System.out.println("finally");
		
		}
		System.out.println("the end");
		}
	
	}
