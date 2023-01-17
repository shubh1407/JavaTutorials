package com.javatutorial.immutable;

import java.util.ArrayList;
import java.util.Collections;
// Design pattern
class ImmutableClass {
	
	private final int num; // primitive var
	
	private final AnotherClass anotherClass;   // non primitive
	
	private final ArrayList<String> strList=new ArrayList<String>();   // Collection
	
	public ImmutableClass(int num,AnotherClass anotherClass) {
		this.num=num;
		this.anotherClass=anotherClass;
	}

	public int getNum() {
		return num;
	}

	public AnotherClass getAnotherClass() throws CloneNotSupportedException {
		return (AnotherClass)anotherClass.clone();
		
	}
	
	public ArrayList<String> getStrList() {
		return (ArrayList<String>) Collections.unmodifiableList(strList);
	}
	
	
	
}


class AnotherClass implements Cloneable{
	
	int number=20;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}




public class ImmutableDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		ImmutableClass immutableClass = new ImmutableClass(10,new AnotherClass());
		
		System.out.println(immutableClass.getNum());
		
		immutableClass.getAnotherClass().number=30;
		
		System.out.println(immutableClass.getAnotherClass().number);
		
		
	}
}
