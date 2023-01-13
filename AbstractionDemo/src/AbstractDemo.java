abstract class AbstractClass {

	public AbstractClass() {

		System.out.println("abstract class constructor");

	}

	public static void sum() {
		System.out.println("sum");
	}

	private void privateMethod() {
		
	}
	
	public final void finalMethod() {
		
	}
	
	public abstract void abstractMethod();
	
	public abstract void abstractMethod2();
	
	public abstract void abstractMethod3();

}

// super() -> parent constructor , must be first statement in any constructor 

// this() -> current constructor , must be first statement in any constructor

class ChildClass extends AbstractClass {

	public ChildClass() {
		//super(1);  // automatically by java compiler
		System.out.println("child class");

	}

	ChildClass(int a) {
		//super(1);
	}

	
	@Override
	public void abstractMethod() {
		sum();
	}

	@Override
	public void abstractMethod2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abstractMethod3() {
		// TODO Auto-generated method stub
		
	}
	
	public static void sum() {
		System.out.println("sum of childclass");
	}

}

public class AbstractDemo{
	public static void main(String[] args) {
		ChildClass childClass= new ChildClass();
		childClass.abstractMethod();
		childClass.abstractMethod2();
		childClass.abstractMethod3();
		AbstractClass.sum();
	}
}

