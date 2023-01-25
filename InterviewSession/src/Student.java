
public class Student {

	private int rollNo;
	private String name;

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.rollNo;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student student = (Student) obj;
		return this.rollNo==student.getRollNo() && this.name.equals(student.getName());
	}
	
//1 -> 	current object is greater
//-1 -> later object is greater
//0 -> both are equal
	/*
	 * @Override public int compareTo(Students o) { return
	 * -(this.rollNo-o.getRollNo()); }
	 */

}
