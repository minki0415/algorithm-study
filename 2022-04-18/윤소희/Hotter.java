
/**
 * 문제 : https://programmers.co.kr/learn/courses/30/lessons/42626
 */
import java.util.PriorityQueue;

public class Hotter {

    public static void main(String[] args) {
        System.out.println(solution(new int[] { 1, 2, 3, 9, 10, 12 }, 7));
    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i : scoville)
            queue.offer(i);

        while (queue.size() >= 2) {
            int a = queue.poll();

            if (a >= K)
                break;

            int b = queue.poll();

            queue.offer(a + b * 2);
            answer++;
        }

        if (queue.peek() < K)
            answer = -1;

        return answer;
    }
}