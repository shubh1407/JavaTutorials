import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Students> linkedList = new LinkedList<Students>();
		
		Students students = new Students(1, "abc");
		linkedList.add(students);
		Students students2 = new Students(2,"def");
		linkedList.add(students2);
		Students students3 = new Students(3, "ghi");
		linkedList.add(students3);
		
		linkedList.add(2, students);
		
		Iterator<Students> iterator = linkedList.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}
		
		linkedList.get(90);  // O(N)
		
		linkedList.contains(students);
		
		linkedList.remove(1);
		
		linkedList.clear();	
// add operation in linkedlist
		
		linkedList.addFirst(students3);   // it becomes first element
		
		linkedList.addLast(students3);    // it becomes last element
		
		linkedList.add(2, students);      // it becomes middle position 3rd element	
	
		linkedList.peek();
// remove operation 
		linkedList.removeFirst();    // as a queue
		linkedList.removeLast();     // as a stack
		linkedList.remove(1);        // as a list
		
		
		linkedList.pop();
		linkedList.poll();
		linkedList.pollFirst();
		linkedList.pollLast();
		
	}
}
