import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class MainClass {

	public static void main(String[] args) {
		
		String [] strArr = {"abc","def","abc","frg","java","c","python"};
		
		String [] outputArr = new String[strArr.length]; // have unique element from above arrays in sorted manner.
		
		
		
		/*for(int i=0;i<strArr.length;i++) {
			boolean isPresent=false;
			for(int j=0;j<outputArr.length;j++) {
				if(outputArr[j].equals(strArr[i])) {
					isPresent=true;
					break;
				}
			}
			if(!isPresent) {
				outputArr[i]=strArr[i];
			}
		}*/
		
		Set<String> treeSet = new TreeSet<String>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.length()-o2.length();
			}
		});
		int count=0;
		for(String str : strArr) {     // O(N)
			treeSet.add(str);
		}
		
		
		for(String str : treeSet) {
			outputArr[count++]=str;
		}
		
		for(String str : outputArr) {
			System.out.println(str);
		}
	}
}
