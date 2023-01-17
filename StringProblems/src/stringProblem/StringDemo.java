//how to make any list or collection immutable
// how to make another class reference variable immutable

package stringProblem;

public class StringDemo {
	
	/*
	 * 1. Stack memory  -> All reference variables or any variables 
	 * 2. Heap memory  -> All objects (new keyword)
	 * 3. String pool memory -> string is created , duplicates not allowed 
	 */

	public static void main(String[] args) {
		/*
		 * String str="java"; // String pool memory 1 string object
		 * 
		 * String str1="java"; // No new Object created
		 * 
		 * String str2="Java"; // 1 new String created
		 * 
		 * String str3="Java"; // No new Object created
		 */		
		String str1="java";    //  1 string object  97+26=
		
		
		String str2="javA";   //  1 string object   65+26=
		
		String str5="";
		
		System.out.println(str5.isBlank());
		
		String str4= new String("Java");   //   1 string object in heap and 1 created in string pool 
		
		//How many objects created in memory in java?
		/*
		 * 1
		 * 2
		 * 3
		 * 4
		 */ 
		String str3 = str2.toLowerCase();  //java in heap   new String("java");
		
		System.out.println(str3==(str2));     //false  
		
		char [] charArr = str1.toCharArray();

	}
	
	

}
