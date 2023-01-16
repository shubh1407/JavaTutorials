class A{
	
}

class B extends A{
	
}

class Parent{
	
	public Parent() {
		//this(1);
	}
	
	
	Parent(int a){
		this();   // super()   
	}
	
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
		/*
		 * Parent parent = getInstance(); parent.sum(1); // at compile time , not
		 * possible to find method body
		 */		
		
		//reference variable
		Object parentClass 
			= getInstance(0);  //Object creation
		
		
	//	parentClass.parentMethod();
		
		//bigger box can store smaller box double can stre int 
		//but viceversa not possible
		double num=1;
		
		
	// Parent class variable can store object of child class	
		
		//override parent method
				//vs
		//Parent method
		
		
		
		
		ParentClass parentClass2 = new ParentClass();
		
		ChildClass parentClass3 = new ChildClass();
		
		ParentClass parentClass4 = new ChildClass();
		
		
		parentClass3.parentMethod();
		
		// defination/declaration of method by reference variable
		// method body by object / reference depends on static or non static
		
	}
	
	
	
	
	
	
	public static Object getInstance(int num){
		if(num==1)
			return new ParentClass();
		if(num==2)
			return new ChildClass();
		if(num==3)
			return new Parent();
		return null;
	 }
}

/**
 * private defult protected public
 * 
 * A=B or A is parent of B then it is overiding
 *        parent         Child
 */
