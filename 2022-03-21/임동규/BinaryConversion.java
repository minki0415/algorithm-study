package codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BinaryConversion {
	
	static Stack<Integer> stack = new Stack<Integer>();
	
	public static void solution(long num) {
		if(num == 1) {
			stack.add(1);
			return;
		} else {
			stack.add((int) (num % 2));
			solution(num / 2);
		}	
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		long num = Long.parseLong(in.readLine());
		
		solution(num);
		
		String answer = "";
		while(stack.size() != 0) {
			answer += stack.pop();
		}
		
		System.out.println(answer);
		in.close();
		
	}
	
//	1.
//	static Stack<String> stack = new Stack<String>();
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		long num = Long.parseLong(in.readLine());
//		
//		while(num != 1) {
//			stack.add(String.valueOf(num % 2));
//			num /= 2;
//		}
//		stack.add(String.valueOf(1));
//		
//		String answer = "";
//		while(stack.size() != 0) {
//			answer += stack.pop();
//		}
//		
//		System.out.println(answer);
//		in.close();
//	
//	}

}
