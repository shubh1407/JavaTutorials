//try catch is handling 
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

	public static void main(String[] args) throws CustomCheckedException{

		int num = 10;
		
		//System.exit(0);
		
		//System.out.println(new ExceptionDemo().methodCall());

		System.out.println("end of program");
		
		throw new CustomCheckedException("my own exception", 100);
		
		
	}
	
	private int methodCall() {
		throw new RuntimeException();
	}
}
