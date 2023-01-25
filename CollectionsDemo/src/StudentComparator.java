import java.util.Comparator;

public class StudentComparator implements Comparator<Students>{

	//1 -> 	current object is greater
	//-1 -> later object is greater
	//0 -> both are equal
	@Override
	public int compare(Students o1, Students o2) {
		return o1.getRollNo()-o2.getRollNo();
	}
}
