import java.util.* ;
import java.io.*; 
import java.util.Scanner;

class ComplexNumber {
	
	int realNo;
    int imagNo;
    
	public ComplexNumber(int realNo, int imagNo) {
		super();
		this.realNo = realNo;
		this.imagNo = imagNo;
	} 
	
	// 2+3i    4+5i     = 8+10i+12i-15   (8-15) + i(10+12)
	public void sum(ComplexNumber complexNumber) {
		this.realNo=this.realNo+complexNumber.realNo;		
		this.imagNo=this.imagNo+complexNumber.imagNo;
	}
	
	public void multiply(ComplexNumber complexNumber) {
		this.realNo=this.realNo*complexNumber.realNo - this.imagNo*complexNumber.imagNo;		
		this.imagNo=this.imagNo*complexNumber.realNo+this.realNo*complexNumber.imagNo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.realNo+" i"+this.imagNo;
	}
	
}

public class ComplexNumberDemo {
	
	public static void main(String args[]) {
		
		
	    
	}
}
		