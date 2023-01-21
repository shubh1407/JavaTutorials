import java.util.ArrayList;
import java.util.Iterator;
/*
 * Collections  -> list   -> 1. Insertion order 
 * 							 2. Duplication allowed
 * 								-> 1. ArrayList 
 * 										 vs		
 * 								-> 2. LinkedList
 * 				-> Set    ->
 * 
 * 				-> Map
 * 				
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Students> list = new ArrayList<Students>();
		//insertion at end
		Students students = new Students(1, "abc");
		list.add(students);
		Students students2 = new Students(2,"def");
		list.add(students2);
		Students students3 = new Students(3, "ghi");
		list.add(students3);
		
		//insertion at any position
		list.add(1,students);
		
		ArrayList<Students> list2 = new ArrayList<Students>();
	
		list2.addAll(list);
		
		//fetching
		System.out.println(list2.get(1).getName());
		
		
		// Deleting
		list2.remove(1);
		
		System.out.println(list2.get(1).getName());
		
		// length
		
		System.out.println(list2.size());
		
		list.clear();
		
		System.out.println(list.size());
		
		System.out.println(list2.contains(students));
		
		list2.lastIndexOf(students);
		
	}
}
