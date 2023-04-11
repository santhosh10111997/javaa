package org.str;

public class Stringss {

	public static void main(String[] args) {
		
		//length
		
		String s="GreensTechnology";
		int length = s.length();
		System.out.println(length);
		
		String s1="SeleniumAutomationtool";
		int length2 = s1.length();
		System.out.println(length2);
		
		String s2="j a v a p r o g r a m";
		int length3 = s2.length();
		System.out.println(length3);
		
		//find index of & last index of
		
		
		//last indexof
		//method 1
		String s3="GreensTechnology";
		int lastIndexOf = s3.lastIndexOf("o");
		System.out.println(lastIndexOf);
		//method 2
		String s4="GreensTechnology";
		System.out.println(s4.lastIndexOf("o"));
		
		//index of
		String s5="GreensTechnology";
		int indexOf = s5.indexOf("n");
		System.out.println(indexOf);
		
		String s6="9095484678";
		System.out.println(s6.indexOf("8"));
		
		
		//charAT (for particular charecter)
		
		String s7="9095484678";
		char charAt = s7.charAt(5);
		System.out.println(charAt);
		
		String s8="SeleniumAutomationtool";
		System.out.println(s8.charAt(8));
		
		//equals
		
		String s9="Java";
		String s10="javA";
		boolean equals = s9.equals(s10);
		System.out.println(equals);
		
		
		String s11="tamba";
		String s12="tamba";
		System.out.println(s11.equals(s12));
		
		
		//equqlsignorcase
		
		String s13="santhosh";
		String s14="santhosH";
		boolean equalsIgnoreCase = s13.equalsIgnoreCase(s14);
		System.out.println(equalsIgnoreCase);
		
		//contains method(check the particular value)
		
		String a="velmurugank451@gmail.com";
		boolean contains = a.contains("@");
		System.out.println(contains);
		
		//replace
		String  s15="Welcome to class java";
		String replace = s15.replace("java","sql");
		System.out.println(replace);
		
		String s16="Greens Adayar";
		System.out.println(s16.replace("Adayar", "omr"));
		
		//replace all
		String s18="Welcome to java class";
		String sa = s18.replaceAll(" ", "%");
		System.out.println(sa);
		
		String s19="5-35-2a,venkatesh nivas,Aruppukottai,pincode-626101";
		System.out.println(s19.replaceAll(",pincode-626101", " "));
		
		//concat(adding valuse)
		String s17="Welcome to java class";
		String concat = s17.concat(" ok");
		System.out.println(concat);
		
		//tolowercase (small letters)
		
		String a1="NISHANTHI";
		System.out.println(a1.toLowerCase());
		
		//toupercase(capital letters)
		String a2="nishanthi";
		System.out.println(a2.toUpperCase());
		
		//upercase
		String a3=" WelcomE";
		String upperCase = a3.toUpperCase();
		String lowerCase = upperCase.toLowerCase();
		System.out.println(lowerCase);
		
		
		//isempty
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
