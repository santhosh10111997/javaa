package org.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exceptionsss {

	public static void main(String[] args) {
		
		//ioexception
	//	File f=new File("");
	//	f.createNewFile();
		
		//numberformatexception
		String s3="1000Rupees";
		System.out.println(s3+100);
		int parseInt = Integer.parseInt(s3);
		System.out.println(parseInt+300);
		
		
	//InputmissmatchException
		Scanner s2=new Scanner(System.in);
		int int1 = s2.nextInt();
		System.out.println(int1);
		
		//IndexOutOfBoundsException
		List<Integer> li=new ArrayList(); 
		li.add(10);
		li.add(20);
		
		System.out.println(li.get(4));
		
		//arrayindexoutofbond
		int a[]=new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		System.out.println(a[4]);
	
		//nullpointerexception
		String s1=null;
		System.out.println(s1.length());
		
		
		
		//stringindexoutofboundsexception
		String s="welcome";
		System.out.println(s.charAt(7));
		
		//arithmetic exception
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4/0");
		System.out.println("5");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}}































