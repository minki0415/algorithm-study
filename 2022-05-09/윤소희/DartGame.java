// https://programmers.co.kr/learn/courses/30/lessons/17682

import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;

        // 점수만 정수 배열로 저장, 옵션은 점수가 따로 없으므로 0으로 저장
        int[] scores = Arrays.stream(dartResult.split("[SDT#*]")).map(ss -> ss.replaceFirst("", "0"))
                .mapToInt(i -> Integer.parseInt(i)).toArray();
        Stack<Integer> stack = new Stack<>();

        // 보너스, 옵션만 char 배열로 저장, 총 3번 점수를 낼 수 있으므로 넉넉하게 길이 10
        char[] etc = new char[10];

        int idx = 0;
        for (int i = 0; i < dartResult.length(); i++) {
            if (dartResult.charAt(i) < '0' || dartResult.charAt(i) > '9') {
                etc[idx++] = dartResult.charAt(i);
            }
        }

        // 보너스 및 옵션 값에 따라 점수를 stack에 저장하거나, 이전 점수를 꺼내 새롭게 계산한 후 재저장
        // Array Bound 초과시 그냥 예외처리
        for (int i = 0; i < etc.length; i++) {
            try {
                if (etc[i] == '\u0000') {
                    continue;
                } else if (etc[i] == 'S') {
                    stack.push(scores[i]);
                } else if (etc[i] == 'D') {
                    stack.push((int) Math.pow(scores[i], 2));
                } else if (etc[i] == 'T') {
                    stack.push((int) Math.pow(scores[i], 3));
                } else if (etc[i] == '*') {
                    int a = stack.pop();

                    if (!stack.isEmpty()) {
                        int b = stack.pop();
                        stack.push(b * 2);
                    }

                    stack.push(a * 2);
                } else if (etc[i] == '#') {
                    stack.push(stack.pop() * -1);
                }
            } catch (Exception e) {

            }

        }

        // stack에 저장한 점수 합산
        while (!stack.isEmpty()) {
            answer += stack.pop();
        }

        return answer;
    }
}