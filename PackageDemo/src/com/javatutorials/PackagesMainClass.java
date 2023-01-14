package com.javatutorials;

import com.javatutorials.package1.*;   // specific class importing   // whole package classes is importing 

import static com.javatutorials.package1.Package1Class.*;


public class PackagesMainClass  {

	
	public static void main(String[] args) {
		
		
		Package1Class package1Class = new Package1Class();
		
		package1Class.getName();
		
		Package1Class package1Class2 = new Package1Class();
		
		
		com.javatutorials.package2.Package1Class package1Class3 = new com.javatutorials.package2.Package1Class();
		
		com.javatutorials.package2.Package1Class package1Class4 = new com.javatutorials.package2.Package1Class();
		
		package1Class3.getName();
	}
	
}
