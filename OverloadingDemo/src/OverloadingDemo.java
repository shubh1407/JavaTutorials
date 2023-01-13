//Overloading
public class OverloadingDemo {

	public OverloadingDemo() {
		// TODO Auto-generated constructor stub
	}
	
	public OverloadingDemo(int a) {
		
	}
	
	public OverloadingDemo(double a,int b) {
		
	}
	
	{
		
	}
	
	public double sum(int a,int b) {
		System.out.println("sum of two numbers");
		return (a+b);
	}
	
	
	public static void main(String[] args) {
		new OverloadingDemo(1,2).sum(1 , 2);
	}
}


// byte < short < char < int < long < float < double 
