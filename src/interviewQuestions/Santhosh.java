package interviewQuestions;

public class Santhosh {
	public static void main(String[] args) {
		
		String a="UdhAYAkumAr";
		StringBuffer s=new StringBuffer(a);
		StringBuffer reverse = s.reverse();
		System.out.println(reverse);
		
		int upper=0;
		int lower=0;
		for(char b: a.toCharArray()) {
			int c= b;
			if(c>=65 && c<=90) {
				upper++;
			}else {
				lower++;
			}
		}
		System.out.println("Upper case chars : "+upper);
		System.out.println("Lower case chars : "+lower);
		
		
		
		
		
		
		
	}
}
