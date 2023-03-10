
public class Students {

	private int rollNo;
	private String name;

	public Students(int rollNo, String name) {
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
		return this.rollNo;
	}
	
	@Override
	public boolean equals(Object obj) {
		Students student = (Students)obj;
		return (this.rollNo==student.getRollNo() && this.name==student.getName());
	}
//1 -> 	current object is greater
//-1 -> later object is greater
//0 -> both are equal
	/*
	 * @Override public int compareTo(Students o) { return
	 * -(this.rollNo-o.getRollNo()); }
	 */

}
