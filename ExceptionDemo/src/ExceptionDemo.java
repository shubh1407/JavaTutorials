import java.io.IOException;

class Parent {
	
	public void methodA() throws Exception{
		System.out.println("Parent method");
	}
}

class Child extends Parent{
	
	@Override
	public void methodA() throws Exception {
		System.out.println("Child method");
	}
}


public class ExceptionDemo {

	public static void main(String[] args) throws ArithmeticException {

		int num = 10;

		
		
		System.out.println(new ExceptionDemo().methodCall());

		System.out.println("end of program");
	}
	
	private int methodCall() {
		throw new RuntimeException();
	}
}
