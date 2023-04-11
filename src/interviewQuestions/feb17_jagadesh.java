package interviewQuestions;

public class feb17_jagadesh {
	public static void main(String[] args) {
		
		 String str = "PROGramming LANguages";
		    str = str.replaceAll(" ", "");
		    int upper = 0;
		    int lower = 0;
		    
		    for(char ch : str.toCharArray()){
		        int c = ch;
		        if(c>=65 && c<=90 ){
		            upper++;
		        }else{
		            lower++;
		        }
		    }
			System.out.println("Upper case chars : "+upper);
			System.out.println("Lower case chars : "+lower);
		}
		
	}


