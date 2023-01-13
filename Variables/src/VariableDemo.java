
public class VariableDemo {

	static double  num=100000000.02;  // inside class outside method  
				// can be access using object of class 
	char ch ='a';
	char ch2='b';
	public double sum() {
		 int num1=20;  // inside method
		return num1+num;
	}
	//
	
	
	
	public void main() {
		System.out.println(num);
		
		
	}
	
	public static void main(String[] args) {
		VariableDemo variableDemo = new VariableDemo();
		System.out.println(variableDemo.num);  
		VariableDemo variableDemo1 = new VariableDemo();
		variableDemo1.num=20;
		System.out.println(variableDemo1.num);  
		System.out.println(variableDemo.num);  
	}
	
}
