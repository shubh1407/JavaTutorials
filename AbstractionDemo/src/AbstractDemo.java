abstract class AbstractClass{  
	
	public AbstractClass() {
		System.out.println("abstract class constructor");
	}
	
	public void nonAbstractMethod() {}
	
	public abstract void abstractMethod();
	
	
}

class ChildClass extends AbstractClass{

	public ChildClass() {
		
	}
	
	@Override
	public void abstractMethod() {
		
	}
	
}



























public class AbstractDemo {

	public static void main(String[] args) {
		
		AbstractClass abstractClass = new ChildClass();
		abstractClass.abstractMethod();
	}
}
