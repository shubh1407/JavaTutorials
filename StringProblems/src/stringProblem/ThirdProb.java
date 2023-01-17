//To check given two string is anagram or not

/*
 * 
 * aabc   -> aaabc    //97
 * cbaa   -> aaabc
 * 
 * cbad
 * abc
 */
package stringProblem;

import java.util.Arrays;

public class ThirdProb {
	//O(N)+O(NlogN)   = O(NlogN)
	//O(N)
	public static boolean isAnagram(String str1,String str2) {
		
		if(str1.length()!=str2.length())
			return false;
		
		/*
		 * // 1st logic char [] char1=str1.toCharArray(); Arrays.sort(char1); // quick
		 * sort O(nlogn) char[] char2 = str2.toCharArray(); Arrays.sort(char2); // quick
		 * sort O(nlogn)
		 * 
		 * 
		 * // O(N) for(int i=0;i<char2.length;i++) { if(char1[i]!=char2[i]) { return
		 * false; } }
		 */
		
		//aaabca // abcaa
		int [] charArr = new int[256];
		Arrays.fill(charArr, 0);
		for(int i=0;i<str1.length();i++) {
			
			charArr[str1.charAt(i)]= charArr[str1.charAt(i)]++;   // a->1  b c->0      a->1   b c->0         a->2  b->-1 c-> -1
			charArr[str2.charAt(i)]= charArr[str2.charAt(i)]--;   // a->0 b c->0       a->1  b-> -1 c->0              
			
		}
		
		
		for(int i=0;i<charArr.length;i++) {
			if(charArr[i]!=0) {
				return false;
			}
		}
		
		
		
		return true;
	}
	
	public static void main(String[] args) {
		boolean result = isAnagram("abcaa", "aaabc");
		
		System.out.println(result);
	}
}
