/*
 * Introduction : With this, you will find attached JavaStreamsExample.java file. In that file 
 * you have two classes, 
 * Student class and JavaStreamsExample. 


Student class :
Has a name
Has a roll number
Has a marks
Constructor to assign all these things
Overrides toString() to get neater output

JavaStreamsExample class :
Has main() method
This class aims at doing 4 things : Print sum of marks, print students having marks less than 80, 
print students having marks greater than 90 and 
prints students having marks equal to 85
Each of these operations is performed using streams on an array of students
Problem Statement :
You are to complete the code of JavaStreamsExample class
You have to provide arguments to mapToInt() and filter() methods 
Since they expect an object of a class implementing functional interfaces, these arguments can be : 
Objects of a class that implements the Functional interface that they expect, Anonymous class 
expressions, Lambda expressions and Method references
You have to pass objects, anonymous classes and expressions to these methods


Files to create :
[ StudentToMarksMapper.java ] : This file will have class that implements a functional interface 
which is expected by mapToInt() method. 
This class will convert a Student to an integer by returning its marks
[ LessThan80Selector.java ] : This file will have class that implements a functional interface 
which is expected by filter() method. 
This class will provide a check (condition) on Student objects, returning true if a Student has 
marks less than 80 and false otherwise.
[ MoreThan90Selector.java ] : This file will have class that implements a functional interface which is expected by filter() method. 
This class will provide a check (condition) on Student objects, returning true if a Student has 
marks more than 90 and false otherwise.
[ EqualTo85Selector.java ] : This file will have class that implements a functional interface which 
is expected by filter() method. 
This class will provide a check (condition) on Student objects, returning true if a Student has 
marks equal to 85 and false otherwise.
[ JavaStreamsExampleWithObjects.java ] : This file will have same code as JavaStreamsExample.java 
except that mapToInt() and filter() methods
 will use the objects of the Mapper and Selector classes. Since all the files are in the same 
 folders and don't have package declarations 
 so the can be used simply by creating objects [without imports]
[JavaStreamsExampleWithAnonymous.java ] : This file will have same code as JavaStreamsExample.java 
except that mapToInt() and filter() methods
 will use anonymous class expressions implementing functional interfaces expected by these 
 methods. [You will have to import those interfaces]
[ JavaStreamsExampleWithLambda.java ] : This file will have same code as JavaStreamsExample.java 
except that mapToInt() and filter() methods 
will use lambda expressions that implement the functional methods of the appropriate functional
 interfaces. 
 */
package stream;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JavaStreamsExamples {
    public static void main(String[] args) throws IOException {
      
    	
    	Student[] students = {	 new Student("abc",1,75)
				    			,new Student("def",2,85)
				    			,new Student("ghi",3,95)
				    			,new Student("abcd",4,76)
				    			,new Student("defg",5,45)
				    			,new Student("ghij",6,35)};
       
       	int sumOfMarks=0;
       	
       	
       	//Write code here to print total sum of all student marks with help of stream api
       	
       	sumOfMarks=	Arrays.stream(students)
       	.mapToInt(stu -> stu.getMarks())   
       	.sum();
       
       	     	
       	System.out.println("total sum of marks : "+sumOfMarks);
        
        System.out.println("\nFollowing students got marks less than 80");
        
       // code
      //  Arrays.stream(students).filter(new LessThan80Selector()).forEach(System.out::println);
       
        Arrays.stream(students).filter(e -> e.getMarks()<80).forEach(System.out::println);
               
        System.out.println("\nFollowing students got marks more than 90");
        
        
       // code
        Arrays.stream(students).filter(new MoreThan90Selector()).forEach(System.out::println);
        
        Arrays.stream(students).filter(e -> e.getMarks()>90).forEach(System.out::println);
        
        System.out.println("\nFollowing students got marks equal to 85 :");
        
        //code
        Arrays.stream(students).filter(new EqualTo85Selector()).forEach(System.out::println);
        
        Arrays.stream(students).filter(e -> e.getMarks()==85).forEach(System.out::println);
        
        Arrays.stream(students).map(stud -> stud).collect(Collectors.toSet());
        
        Arrays.stream(students).map(stud -> stud).collect(Collectors
        		.toMap(stud -> stud.getRoll(),stu -> stu));
        
       Map<Integer,List<Student>> map= Arrays.stream(students).map(stud -> stud)
    		   .collect(Collectors.groupingBy(stud -> stud.getMarks()));
    }
    
}

// 10 employees and 3 dep (a,b,c)
// 3 -> a

// 4 -> b

// 3 -> c







class Student{
    private String name;
    private int roll;
    private int marks; 
    
    public Student() {
		// TODO Auto-generated constructor stub
	}
    
    Student(String name, int roll, int marks){
    	
    	this.name=name;
    	this.roll = roll;  // current object
    	this.marks=marks;
    	
    }
    
    @Override
    public String toString(){
        return "("+roll+", "+name+")";
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
}


class LessThan80Selector implements Predicate<Student>{

	@Override
	public boolean test(Student t) {
		if(t.getMarks()<80) {
			return true;
		}
		return false;
	}
	
}

class MoreThan90Selector implements Predicate<Student>{

	@Override
	public boolean test(Student t) {
		if(t.getMarks()>90) {
			return true;
		}
		return false;
	}
}


class EqualTo85Selector implements Predicate<Student>{

	@Override
	public boolean test(Student t) {
		if(t.getMarks()==85) {
			return true;
		}
		return false;
	}
	
}






