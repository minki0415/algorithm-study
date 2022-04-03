import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;

public class FindCities {

    static int N;
    static int M;
    static int K;
    static int X;
    static LinkedList<Integer>[] lists;

    public static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");

        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);
        K = Integer.parseInt(s[2]);
        X = Integer.parseInt(s[3]);

        lists = new LinkedList[N + 1];

        for (int i = 0; i < N + 1; i++) {
            lists[i] = new LinkedList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            s = br.readLine().split(" ");

            lists[Integer.parseInt(s[0])].add(Integer.parseInt(s[1]));
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();

        // 정점, 거리
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer[]> queue = new LinkedList<>();
        boolean[] visit = new boolean[N + 1];

        queue.offer(new Integer[] { X, 0 });
        visit[0] = true;
        visit[X] = true;

        while (!queue.isEmpty()) {
            Integer[] q = queue.poll();

            int v = q[0];
            int distance = q[1];

            if (distance == K) {
                answer.add(v);
                continue;
            }

            for (int i : lists[v]) {
                if (visit[i])
                    continue;

                queue.offer(new Integer[] { i, distance + 1 });
                visit[i] = true;
            }
        }

        if (answer.isEmpty())
            answer.add(-1);

        Collections.sort(answer);

        for (int a : answer) {
            System.out.println(a);
        }
    }
}
