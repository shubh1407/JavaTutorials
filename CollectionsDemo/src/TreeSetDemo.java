// Comparable VS Comparator -> comparision of objects

// Why we have comparator if we have comparable already?

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		// Either data must implement comparable or pass comparator object in constructor of treeSet.
		// Comparator has higher priority as compared to comparable if both are using in treeSet
		
		TreeSet<Students> treeSet = new TreeSet<Students>();
		treeSet.add(new Students(1, "abc"));
		
		treeSet.add(new Students(2,"def"));
		
		treeSet.add(new Students(3,"def"));
		
		treeSet.add(new Students(4,"def"));
		
		
		for(Students students : treeSet) {
			System.out.println(students.getRollNo());
		}
		
		
		TreeSet<Students> treeSet2 = new TreeSet<Students>((o1,o2) -> {
			return 0;
		});
		treeSet2.add(new Students(1, "abc"));
		
		treeSet2.add(new Students(2,"def"));
		
		treeSet2.add(new Students(3,"def"));
		
		treeSet2.add(new Students(4,"def"));
		
		
		for(Students students : treeSet2) {
			System.out.println(students.getRollNo());
		}
		
		TreeSet<String> treeSet3 = new TreeSet<String>();
	}
}
