package stream;

import java.util.Optional;

public class OptionalDemoClass {

	public static void main(String[] args) {
		
		Optional<Object> object = new OptionalDemoClass().getObject(-10);
		// java 7 
		System.out.println(object.get().hashCode());	// NullPointerException
	}
	
	public Optional<Object> getObject(int num) {
		
		if(num>0) {
			Optional.of(new Object());
		}
		return Optional.ofNullable(null);
	}
}


//null

// 