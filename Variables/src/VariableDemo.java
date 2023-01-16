public strictfp class VariableDemo {

	static double  num=100000000.02;  // inside class outside method  
				// can be access using object of class 
	char ch ='a';
	float num2=5.0F/7.0F;  
	char ch2='b';
	
	public float sum() {
		 float num1=5.0F/7.0F;  // inside method
		return num1;
	}
	//
	
	
	
	public void main() {
		System.out.println(num);
		
		
	}
	
	public static void main(String[] args) {
		VariableDemo variableDemo = new VariableDemo();
		
		System.out.println(variableDemo.sum());  
	}
	
}
