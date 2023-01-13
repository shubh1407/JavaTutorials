// Calculator ->

interface Calculator{
	
	int sum(int a,int b);
	
	int sum(int a,int b,int c);
	
	int subs(int a,int b);
	
	int mult(int a,int b);
	
	double divi(int a,int b);
}


class BaseCalculator implements Calculator{

	@Override
	public int sum(int a, int b) {
		return a+b;
	}
	
	@Override
	public int sum(int a, int b, int c) {
		return a+b+c;
	}

	@Override
	public int subs(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int mult(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double divi(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}
		
}


class ScientificCalculator implements Calculator{

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sum(int a, int b, int c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int subs(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int mult(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double divi(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}


public class InterfaceDemo {

}
