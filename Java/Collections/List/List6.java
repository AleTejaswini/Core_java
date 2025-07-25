package list;

import java.util.Stack;

import java.util.Stack;

public class List6 {
	public static boolean isBalanced(String exp) {
		Stack<Character> stack = new Stack<>();
		
	for(char ch :exp.toCharArray()) {
		if(ch== '(' || ch== '{' || ch=='[') {
			stack.push(ch);
		}
		else if(ch == ')' || ch== '}' || ch==']') {
			if(stack.isEmpty()) {
				return false;
			
		}
		char top = stack.pop();
		
		if((ch== ')' && top != '(' )||
			(ch == '}' && top !='{' )||
			(ch == ']' && top != '[')) {
			return false;
		}}
		
	}
			
			
	
	return stack.isEmpty();
	}

	public static void main(String[] args) {
		String input = "[{{}}]";
		System.out.println(isBalanced(input) ? "Balanced" : "Not Balanced"); // ternary operator
		
		}
		
}



