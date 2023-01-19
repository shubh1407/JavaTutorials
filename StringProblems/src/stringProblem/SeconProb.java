//find the reverse of given String 

// abcdf  ->  fdcba

/*
 * 
 * Java is programming language
 * 
 * language programming is Java.
 *  
 */
package stringProblem;

public class SeconProb {
	
	public static String reverseStr(String str) {
		
		StringBuilder stringBuilder = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			stringBuilder.append(str.charAt(i));
		}
		
		
		char [] ch = str.toCharArray();
		
		int i=0;
		int j=str.length()-1;
		char temp;
		while(true) {
			
			temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			
			if(i>=j)
				break;
			i++;
			j--;
		}
		
		return stringBuilder.toString();
	}
	
	public static void main(String[] args) {
		
		System.out.println(SeconProb.reverseStr("abdgt"));
	}
}
