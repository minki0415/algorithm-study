
/**
 * Taekwon
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;

public class Taekwon {
    static int N;
    static int[] S;
    static int[] T;
    static StringBuilder sb = new StringBuilder();

    public static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        S = new int[N];
        T = new int[N];

        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");

            S[i] = Integer.parseInt(s[0]);
            T[i] = Integer.parseInt(s[1]);
        }

        br.close();
    }

    public static void findCount(int s, int t) {
        Queue<Integer[]> queue = new LinkedList<>();
        queue.offer(new Integer[] { s, t, 0 });

        while (!queue.isEmpty()) {
            Integer[] score = queue.poll();
            int scoreS = score[0];
            int scoreT = score[1];
            int count = score[2];

            if (scoreS == scoreT) {
                sb.append(count + "\n");
                return;
            }

            if (scoreS > 200)
                continue;

            queue.offer(new Integer[] { scoreS * 2, scoreT + 3, count + 1 });
            queue.offer(new Integer[] { scoreS + 1, scoreT, count + 1 });

        }
    }

    public static void main(String[] args) throws IOException {
        init();
        for (int i = 0; i < N; i++) {
            findCount(S[i], T[i]);
        }
        System.out.println(sb);
    }
}