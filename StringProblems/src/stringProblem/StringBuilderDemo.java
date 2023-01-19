package stringProblem;

public class StringBuilderDemo {

	
	public static void main(String[] args) {
		
		StringBuilder stringBuilder = new StringBuilder();   // heap //mutable string
		
		stringBuilder.append(" is programming language");
		
		System.out.println(stringBuilder.toString());
		
		//stringBuilder.reverse();
		
		System.out.println(stringBuilder.lastIndexOf("i"));
	}
}
