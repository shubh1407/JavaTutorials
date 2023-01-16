package com.javatutorials.Object;

import java.lang.reflect.Method;

class ObjectClassMethodsDemo implements Cloneable{
	
	int num;
	
	
	public ObjectClassMethodsDemo(int num) {
		super();
		this.num = num;
	}


	public void sum() {
		// TODO Auto-generated method stub

	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "my num "+num;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("objects destroyed");
		super.finalize();
	}
}







public class ObjectsDemo {

	public static void main(String[] args) throws Throwable {
		ObjectClassMethodsDemo objectClassMethodsDemo = new ObjectClassMethodsDemo(10);
		
		System.out.println(objectClassMethodsDemo.getClass());   //Object of Class class (having all information of that class)
		
		for(Method m: objectClassMethodsDemo.getClass().getMethods()) {
			System.out.println(m.getName());
		}
		
		System.out.println(objectClassMethodsDemo.hashCode());
		
		System.out.println(objectClassMethodsDemo.num);
		
		ObjectClassMethodsDemo clonedObject = (ObjectClassMethodsDemo) objectClassMethodsDemo.clone();
		
		
		clonedObject.finalize();   // Just expecting objects will destroy by GC.
	}
}


