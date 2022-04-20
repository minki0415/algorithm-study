
//문제 : https://programmers.co.kr/learn/courses/30/lessons/42587
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

public class Printer {
    public static void main(String[] args) {
        System.out.println(solution(new int[] { 2, 1, 3, 2 }, 2));
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int i : priorities)
            queue.add(i);

        Arrays.sort(priorities);

        int i = priorities.length - 1;
        while (true) {
            int q = queue.poll();
            location--;

            if (priorities[i] == q) {
                answer++;
                i--;

                if (location < 0) {
                    return answer;
                }
            } else {
                queue.add(q);

                if (location < 0) {
                    location = queue.size() - 1;
                }
            }
        }
    }
}
