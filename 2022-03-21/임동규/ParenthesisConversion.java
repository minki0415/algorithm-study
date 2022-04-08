package level2;

import java.util.Stack;

public class ParenthesisConversion {
	
	public static String solution(String p) {
		if(p.equals("")) {
			return p;
		}
		
        String[] strArr = p.split("");
        int len = strArr.length;
        
        int index = 0;
        int cnt = 0;
        for(int i = 0; i < len; i++) {
        	if(strArr[i].equals("(")) {
        		cnt++;
        	} else {
        		cnt--;
        	}
        	
        	index++;
        	
        	if(cnt==0) {
        		break;
        	}
        	
        }
        
        String u = p.substring(0,index);
        String v = p.substring(index);
        
        StringBuilder sb = new StringBuilder();
        if(isCorrect(u)) {
        	return u + solution(v);
        } else {
        	sb.append("(");
        	sb.append(solution(v));
        	sb.append(")");
        	sb.append(reverse(u));
        }
        
        return sb.toString();
    }
	
	public static boolean isCorrect(String u) {
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < u.length(); i++) {
			char ch = u.charAt(i);
			
			if(ch == '(') {
				stack.add(ch);
			} else if(ch == ')'){
				if(stack.isEmpty() || stack.peek() != '(') {
					return false;
				} else {
					stack.pop();
				}
			}
		}
		
		return stack.size() == 0;	
	}
	
	public static String reverse(String u) {
		String result = "";
		for(int i = 1; i < u.length() - 1; i++) {
			if(u.charAt(i) == '(') {
				result += ")";
			} else {
				result += "(";
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		String p = ")(";

		System.out.println(solution(p));
	}

}
