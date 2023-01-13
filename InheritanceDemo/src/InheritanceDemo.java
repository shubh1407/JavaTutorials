class A{
	
}

class B extends A{
	
}

class Parent{
	
	public void sum() {
		System.out.println("parent class method");
	}
	
	public A sum(int a) {
		System.out.println("parent class method");
		return null;
	}
}


public class InheritanceDemo {

	public static void main(String[] args) {
		Parent parent = getInstance();
		parent.sum(1);   // at compile time , not possible to find method body
	}
	
	
	
	
	
	
	public static Parent getInstance(){
		 return new Parent();
	 }
}

/**
 * private defult protected public
 * 
 * A=B or A is parent of B then it is overiding
 *        parent         Child
 */
