import java.util.HashMap;

public class MainClass {

	public static void main(String[] args) {
		
		HashMap<Student, Student> hashMap = new HashMap<Student, Student>();
		
		hashMap.put(new Student(1,"abc"), new Student(1, "abc"));
		hashMap.put(new Student(1,"abc"), new Student(1, "abc"));
		hashMap.put(new Student(1,"abc"), new Student(1, "abc"));
		hashMap.put(new Student(1,"abc"), new Student(1, "abc"));
		
		System.out.println(hashMap.size());
	}
}
