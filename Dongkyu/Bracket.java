package codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// °ýÈ£
public class Bracket {

	public static boolean isValid(String ps) {
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i < ps.length(); i++) {
			char ch = ps.charAt(i);
			
			if(ch == '(') {
				stack.add(ch);
			} else if(ch == ')'){
				if(stack.empty() || stack.peek() != '(') {
					return false;
				} else {
					stack.pop();
				}
			}
		}
		
		return stack.size() == 0;
		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
				
		for(int i=0; i<n; i++) {
			String ps = in.readLine();
	
			if(isValid(ps)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		}
		
		in.close();

	}

}

