import java.util.ArrayList;
import java.util.Iterator;
/*
 * Collections  -> list   -> 1. Insertion order 
 * 							 2. Duplication allowed
 * 								-> 1. ArrayList   -> manipulation is slower but fetching faster
 * 												  -> Act as a list only.
 * 										 vs		
 * 								-> 2. LinkedList  -> manipulation is faster but fetching slower, 
 * 												  -> Act as stack, queue and list.
 * 				
 * 				-> Set    -> 1. Insertion order not maintained
 * 						  	 2. Duplication not allowed
 * 								  -> 1. HashSet
 * 											-> Hashing is method to insert element in hashset.
 * 									 2. LinkedHashSet
 * 								     3. TreeSet
 * 
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
		list2.remove(students);
		
		System.out.println(list2.get(1).getName());  //O(1)
		 
		// length
		
		System.out.println(list2.size());
		
		list.clear();
		
		System.out.println(list.size());
		
		System.out.println(list2.contains(students));
		
		list2.lastIndexOf(students);
		
	}
}
