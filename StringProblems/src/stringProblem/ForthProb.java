//Check string has balanced parenthesis     {]

/* {(})
 * {[}]
 * 
 * ]][[
 * {}
 * {()}
 * 
 * {)
 * 
 * [{[
 * 
 * [{]}
 * 
 * 12323
 */

package stringProblem;

import java.util.Stack;

public class ForthProb {

	public static boolean isBalancedParathensis(String str) {

		Stack<Character> stack = new Stack<Character>();  //O(1)
		//

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '[' || str.charAt(i) == '{' || str.charAt(i) == '(') {
				stack.push(str.charAt(i));
			}
			else if (str.charAt(i) == ']' && (stack.isEmpty() || stack.pop() != '[')) {
				return false;
			} else if (str.charAt(i) == '}' && (stack.isEmpty() || stack.pop() != '{')) {
				return false;
			} else if (str.charAt(i) == ')' && (stack.isEmpty() || stack.pop() != '(')) {
				return false;
			}
		}
		
		if(stack.isEmpty()) {
			return true;
		}

		return false;

	}

	public static void main(String[] args) {
		System.out.println(isBalancedParathensis("[]"));
	}

}