package stream;
// stream is working for collections,arrays or any group of elements only
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
	Boolean allMatch    -> check all elements satisfy particular condition return true otherwise false
	Boolean anyMatch
	Collect
	Count
	Distinct
	findAny
	findFirst
	forEach
	Limit
	Filter
	toArray
	Map  -> convert each element of stream to different value
	sorted
	max
	min 
 */
public class StreamApiDemo {

	public static void main(String[] args) {
		
		
	
		ArrayList<Integer> inputArrayList = new ArrayList<Integer>();
		inputArrayList.add(10);
		inputArrayList.add(10);
		inputArrayList.add(10);
		inputArrayList.add(2);
		inputArrayList.add(5);
		inputArrayList.add(4);
		inputArrayList.add(7);
		inputArrayList.add(8);
		inputArrayList.add(9);
		inputArrayList.add(12);
		inputArrayList.add(19);
		inputArrayList.add(100);
		inputArrayList.add(103);
		inputArrayList.add(105);
		
		ArrayList<Integer> output = new ArrayList<Integer>();
		
		// get all elements which is even from above list // filter
		
		//java 7
		for(int num : inputArrayList) {
			if(num%2==0) {
				output.add(num);
			}
		}
		
		
	
		
		// java 8 
		
		output = (ArrayList<Integer>) 
				inputArrayList.stream().filter(num -> num%2==0).collect(Collectors.toList());
		
	
		output.forEach(System.out::println);
		
		// min element
		
		//java 7 
		
		int min =Integer.MAX_VALUE;
		
		for(int num : inputArrayList) {
			if(min>num) {
				min=num;
			}
		}
		System.out.println(min);
		
		// java 8
		
		System.out.println(inputArrayList.stream().mapToInt(num -> num).min().getAsInt());
		
		//max
		// java 8
		
		System.out.println(inputArrayList.stream().mapToInt(num -> num).max().getAsInt());
		
		// java 8
		//allMatch
		
		System.out.println(inputArrayList.stream().allMatch(num -> num%2==0));
		
		// java 8
		//anyMatch
		
		System.out.println(inputArrayList.stream().anyMatch(num -> num%2==0));
		
		
		//max
		// java 8
		
		System.out.println(inputArrayList.stream().distinct().count());
		
		
		System.out.println(inputArrayList.stream().filter(num -> num%2==0).findAny().get());
	}
}
