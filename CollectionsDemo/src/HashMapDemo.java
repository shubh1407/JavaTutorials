import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {

		TreeMap<Integer, Students> treeMap = new TreeMap<Integer, Students>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		});

		treeMap.put(1, new Students(1, "abc"));   //inserted   1
		
		treeMap.put(2, new Students(2, "def"));	  //inserted   2
		
		treeMap.put(2, new Students(2, "defg"));  // equal so replaced  2
		
		Iterator<Map.Entry<Integer, Students>> iterator= treeMap.entrySet().iterator();   // Set<Entry>   class Entry<K,V> 
		System.out.println(treeMap.size());
		while(iterator.hasNext()) {
			Map.Entry<Integer, Students> entry = iterator.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getName());
		}
		
		
		Iterator<Integer> iterator2 = treeMap.keySet().iterator();
		
		while(iterator2.hasNext()) {
			Integer key = iterator2.next();
			System.out.println(key);
			System.out.println(treeMap.get(key).getName());
		}
	}
}
