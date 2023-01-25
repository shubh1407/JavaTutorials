import java.util.ArrayList;

public class CustomArrayList<E> extends ArrayList<E> {

	
	@Override
	public boolean add(E e) {
		int hashcode = e.hashCode();  // hash function
		super.add(hashcode, e);
		return true;
	}
	
	
	@Override
	public boolean contains(Object o) {
		int hashcode = o.hashCode();   // hash function
		
		return super.get(hashcode)!=null && super.get(hashcode).equals(o);
	}
}


