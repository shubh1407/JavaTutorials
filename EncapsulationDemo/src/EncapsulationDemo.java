class Student{
	
	private int rollNo;   // data
	private String name;  //data
	private int code = 102345;
	private int count=0;
	
	
	//Getter
	public int getRollNo(int code) {
		if(this.code==code) {
			System.out.println("you are authenticate");
		}
		else {
			System.out.println("you are invalid user");
			return 0;
		}
		count++;
		return rollNo;
		
	}
	
	//Setter
	public void setRollNo(int rollNo,int code) {
		if(this.code==code) {
			System.out.println("you are authenticate");
		}
		else {
			System.out.println("you are invalid user");
		}
		this.rollNo = rollNo;
	}
	
	public String getName(int code) {
		if(this.code==code) {
			System.out.println("you are authenticate");
		}
		else {
			System.out.println("you are invalid user");
			return null;
		}
		return name;
	}
	
	public void setName(String name,int code) {
		if(this.code==code) {
			System.out.println("you are authenticate");
		}
		else {
			System.out.println("you are invalid user");
		}
		this.name = name;
	}
}


public class EncapsulationDemo {

	
	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.setRollNo(1,2);
		
		System.out.println(student.getRollNo(2));
		
		
	}
}
