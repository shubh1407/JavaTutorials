/*
 * 
 * A -> marks between 70 & 80
 * 
 * B -> marks between 50 & 70
 * 
 * C-> marks 40 & 50
 * 
 * fail -> marks less than 40
 */
public class CheckEvenNum {

	public void gradeOfStudent(double marks) {
		
		
		
		// if else ladder 
	
		if(marks>70) {
			//A
		}
		else if(marks>50) {
			//B
		}
		else if(marks>40) {
			//C
		}
		else {
			//fail
		}
		
	}
	
	public static void main(String[] args) {
		
		CheckEvenNum checkEvenNum = new CheckEvenNum();
		
		checkEvenNum.gradeOfStudent(23);
	}
}
