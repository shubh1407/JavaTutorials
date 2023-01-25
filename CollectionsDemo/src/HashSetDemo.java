import java.util.HashSet;
import java.util.Iterator;
// hashcode -> tells us index where value is stored 
// equals -> tells us this object is equal or not.

public class HashSetDemo {

	public static void main(String[] args) {
		/*
		 * HashSet<Integer> hashSet = new HashSet<Integer>();
		 * 
		 * hashSet.add(1); hashSet.add(2); hashSet.add(3); hashSet.add(3);
		 * hashSet.add(3); hashSet.add(2);
		 * 
		 * System.out.println(hashSet.size());
		 */
		
		HashSet<Students> hashSet2 = new HashSet<Students>();
		
		Students students = new Students(1, "abc");
		hashSet2.add(students);
		
		Students students2 = new Students(3,"def");
		hashSet2.add(students2);
		
		Students students3 = new Students(2, "ghi");
		hashSet2.add(students3);
		
		Students students4 = new Students(4, "jkl");
		hashSet2.add(null);
		hashSet2.add(null);
		System.out.println(hashSet2.size());
		
		Iterator<Students> iterator = hashSet2.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}
		
		
		hashSet2.remove(students);
		
		hashSet2.clear();
		
		hashSet2.remove(students);
		
		
		
		
		
	}
}
