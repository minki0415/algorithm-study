//문제 : https://programmers.co.kr/learn/courses/30/lessons/60058

import java.util.Stack;

public class RoundBrackets {
    public static void main(String[] args) {
        System.out.println(solution("()))((()"));
    }

    public static String solution(String p) {
        if (isBalanced(p))
            return p;
        else
            return recursion("", p);
    }

    // 올바른 문자열인지 검사
    public static boolean isBalanced(String u) {
        int len = u.length();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < len; i++) {
            if (u.charAt(i) == '(') {
                stack.add(0);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        return true;
    }

    // u,v 나누는 함수
    public static String[] splitUV(String p) {
        int len = p.length();
        Stack<Character> stack = new Stack<>();
        String u = "", v = "";
        int i;
        char first = p.charAt(0);
        stack.add(first);

        for (i = 1; i < len; i++) {
            char now = p.charAt(i);

            if (stack.isEmpty())
                break;

            if (first == now) {
                stack.add(now);
            } else {
                stack.pop();
            }
        }

        u = p.substring(0, i);
        v = p.substring(i);

        return new String[] { u, v };
    }

    // u 뒤집는 함수
    public static String reverse(String u) {
        String newU = "";
        int len = u.length();
        u = u.substring(1, len - 1);

        for (int i = 0; i < len - 2; i++) {
            if (u.charAt(i) == ')') {
                newU += "(";
            } else {
                newU += ")";
            }
        }
        return newU;
    }

    // 재귀 처리 함수
    public static String recursion(String answer, String p) {
        if (p.equals(""))
            return "";

        String[] uv = splitUV(p);
        String u = uv[0];
        String v = uv[1];

        if (isBalanced(u)) {
            return u + recursion("", v);
        } else {
            return "(" + recursion("", v) + ")" + reverse(u);
        }
    }

}