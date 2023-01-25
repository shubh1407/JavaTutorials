import java.util.function.BiConsumer;
import java.util.function.IntConsumer;
import java.util.function.Predicate;

import java.util.function.Function;

@FunctionalInterface
interface Functional {
	void sum(int num);
	// void sum2(int num);
}

// one way -> dedicated class
class ImplementingClass implements Functional {
	@Override
	public void sum(int num) {
		// TODO Auto-generated method stub

	}

	// @Override
	public void sum2(int num) {
		// TODO Auto-generated method stub

	}
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {

		// second way annonymous inner class
		Functional functionalInterface = new Functional() {

			@Override
			public void sum(int num) {
				// TODO Auto-generated method stub

			}
		};
		functionalInterface.sum(3);

		Functional functional = (n) -> {
			System.out.println(n);
		}; 
		// lambda expression
		functional.sum(10);

		IntConsumer intConsumer = new IntConsumer() {

			@Override
			public void accept(int value) {
				// TODO Auto-generated method stub

			}
		};

		IntConsumer intConsumer2 = (value) -> {
		};

		// Method reference
		IntConsumer intConsumer3 = new FunctionalInterfaceDemo() :: methodReferenceMethod3;
		
		BiConsumer<Integer, Integer> biConsumer = new BiConsumer<Integer, Integer>() {
			@Override
			public void accept(Integer t, Integer u) {
				// TODO Auto-generated method stub

			}
		};

		BiConsumer<Integer, Integer> biConsumer2 = (t, u) -> {
			System.out.println("hello");
		};

		Predicate<Integer> predicate = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return false;
			}
		};

		Predicate<Integer> predicate2 = num -> {
			return false;
		};
		
		// method reference
		Predicate<Integer> predicate3 = new FunctionalInterfaceDemo() :: methodReferenceMethod2;
		

		Function<Integer, String> function = new Function<Integer, String>() {
			@Override
			public String apply(Integer t) {
				// TODO Auto-generated method stub
				return null;
			}
		};

		Function<Integer, Integer> function2 = (num) -> {
			System.out.println("lambda expression");
			return null;
		};
		
		//Method reference
		
		Function<Integer, Integer> function3 = new FunctionalInterfaceDemo() 
				:: methodReferenceMethod;
		
		function3.apply(2);
	}
	
	public Integer methodReferenceMethod(int num){
		System.out.println("method reference expression");
		return null;
	}
	
	
	public boolean methodReferenceMethod2(int num){
		System.out.println("method reference expression");
		return false;
	}
	
	public void methodReferenceMethod3(int num){
		System.out.println("method reference expression");
		//return false;
	}
	
}
