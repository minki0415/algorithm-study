//문제 : https://programmers.co.kr/learn/courses/30/lessons/12978

public class Delivery {

    public static void main(String[] args) {
        System.out.println(solution(5,
                new int[][] { { 1, 2, 1 }, { 2, 3, 3 }, { 5, 2, 2 }, { 1, 4, 2 }, { 5, 3, 1 }, { 5, 4, 2 } }, 3));
    }

    public static int solution(int N, int[][] road, int K) {
        int answer = 0;
        int[] distance = new int[N + 1];
        boolean[] visit = new boolean[N + 1];

        for (int i = 2; i < N + 1; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        visit[0] = true;
        visit[1] = true;

        int start = 1;

        while (true) {
            for (int[] r : road) {
                int s = r[0];
                int e = r[1];
                int w = r[2];

                if (s == start && !visit[e]) {
                    distance[e] = distance[e] > distance[s] + w ? distance[s] + w : distance[e];
                }

                if (e == start && !visit[s]) {
                    distance[s] = distance[s] > distance[e] + w ? distance[e] + w : distance[s];
                }
            }

            int min = Integer.MAX_VALUE;
            for (int i = 2; i < N + 1; i++) {
                if (visit[i])
                    continue;

                if (min > distance[i]) {
                    min = distance[i];
                    start = i;
                }
            }

            if (min == Integer.MAX_VALUE)
                break;
            visit[start] = true;
        }

        for (int i = 2; i < N + 1; i++) {
            if (distance[i] <= K)
                answer++;
        }

        return answer + 1;
    }
}
