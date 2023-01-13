import java.io.Serializable;

interface A{
	
}


interface B {
	
	public void sum() ;
	
}

class C implements Serializable {

	public void sum() {
		System.out.println("sum of C");
		
	}
	
}


public class MultiPleInheritanceDemo {

	public static void main(String[] args) {
		C c = new C();
		c.sum();   //
	}
}
