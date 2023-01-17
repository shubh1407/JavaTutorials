//Find given words is Palindrome or not

// mam
// abcba
// abccb -> not 
package stringProblem;

import java.util.Scanner;

public class FirstProb {
	
	// space 
	// time                     
	public static boolean isPalindrome(String str) {
		boolean result =true;
		/*
		 * char [] charArr = str.toCharArray();
		 * 
		 * for(int i=0;i<charArr.length;i++) {
		 * if(charArr[i]!=charArr[charArr.length-i-1]) { result=false; break; } }
		 */
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				result=false;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		System.out.println(FirstProb.isPalindrome("abcaba"));
	}
}
