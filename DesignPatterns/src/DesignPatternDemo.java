// singleton design pattern
class DatabaseClass{
	
	
	String userName;
	String password;
	
	private static DatabaseClass databaseClass = null;  // eager initialization
	
	private DatabaseClass() {
		
	}
	
	public static DatabaseClass getInstance() {
		if(databaseClass==null) {
			databaseClass= new DatabaseClass();
		}
		return databaseClass;
	}
	
	
}


public class DesignPatternDemo {

	public static void main(String[] args) {
		
		//DatabaseClass databaseClass = DatabaseClass.getInstance();
	}
}
