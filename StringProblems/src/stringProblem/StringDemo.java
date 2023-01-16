//how to make any list or collection immutable
// how to make another class reference variable immutable

package stringProblem;

public class StringDemo {
	
	

	public static void main(String[] args) {
		
		Object object     // Stack memory
		= new Object();  // Heap memory
		
		
		String str ="Java";    // without new keyword is not a normal object , it is created in string pool memory   javac
		str=str+" is programming language";  // new separate string in memory
		System.out.println(str);
		
		String str2="Java";
		
		System.out.println("Java"==str2);
		/*
		 * String str2 = new String("Java"); // heap and s.p memory
		 * 
		 * String str4 = new String("Java"); // heap and s.p memory
		 */		
		//String str3 = "Java";
		
		
		
		//System.out.println(str.equals(str2));   // true or false
		
		//System.out.println((str==str2));
		
		
	}
	
	

}
