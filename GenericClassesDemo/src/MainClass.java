
public class MainClass {

	public static void main(String[] args) {
		
		BuildingClass<Student> buildingClass = new BuildingClass<Student>(new Student());
		buildingClass.getType();
		
	}
}
