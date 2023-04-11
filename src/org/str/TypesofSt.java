package org.str;

public class TypesofSt {

	public static void main(String[] args) {
		
		//litral String
		
		String s1="welcome";
		String s2="welcome";
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		
		//non litteral string
		
		String s3=new String("welcome");
		String s4=new String("welcome");
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		
		
		//immutable to mutable
		//stringbuffer
		
		StringBuffer s5=new StringBuffer("welcome");
		StringBuffer s6=new StringBuffer("welcome");
		
		StringBuffer s7 = s5.append(s6);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		
		//declare string value & returntype string value are same.
		
		System.out.println(System.identityHashCode(s5)); //declare
		System.out.println(System.identityHashCode(s6));
		System.out.println(System.identityHashCode(s7)); //return type
		
		//so the string is mutable
		
		
		//diff method
		
		String a="welcome";
		String b=new String("welcome");
		
		System.out.println(a==b);   //compare memory
		
		System.out.println(a.equals(b)); //compare value
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
