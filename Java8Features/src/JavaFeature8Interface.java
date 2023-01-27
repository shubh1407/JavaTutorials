/*
 * Has two more type of methods 
 * default and static
 */

@FunctionalInterface
public interface JavaFeature8Interface {

	void sum(); // public abstract

	default void sum2() {
		//
	}

}

@FunctionalInterface
interface JavaFeature8Interface2 {

	void sum(); // public abstract

	default void sum2() {
		//
	}

}

class ImplementationClass implements JavaFeature8Interface, JavaFeature8Interface2 {

	@Override
	public void sum() {
		// TODO Auto-generated method stub

	}

	// Way to support multiple inheritance in interface , have to override default
	// method
	// if both has same name method.
	@Override
	public void sum2() {

	}
}

class MainClass{
	
	public static void main(String[] args) {
		
		//Lambda expression
		JavaFeature8Interface javaFeature8Interface = ()-> System.out.println("lambda expression");
		
		JavaFeature8Interface javaFeature8Interface1 = System.out::println;  // method reference
		
	}
}
																																												// return p;    }}
