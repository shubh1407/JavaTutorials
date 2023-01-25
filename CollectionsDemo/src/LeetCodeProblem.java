import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCodeProblem {

	public static List<Integer> intersection(int[][] nums) {
        int [] freqArr = new int [1001];
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.fill(freqArr, 0);
        for(int [] arr : nums){
            for(int n: arr){
                freqArr[n]=freqArr[n]+1;
            }
        }
        //System.out.println(nums.length);
        for(int i=0;i<freqArr.length;i++) {
        	if(freqArr[i]==nums.length) {
        		list.add(i);
        	}
        }
        
        return list;
    }
	
	
	public static void main(String[] args) {
		
		List<Integer> list=intersection(new int [][]{{1,2,3},{4,5,6}});
		
		List<Integer> list2=intersection(new int [][] {{3,1,2,4,5,6},{1,2,3,4,6},{3,4,5,6}});
		
		System.out.println(list);
		
		System.out.println(list2);
	}
}
