
// https://www.acmicpc.net/problem/1012
/**
 * Cabbage
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;

public class Cabbage {
    static StringBuilder sb = new StringBuilder();
    static int[] dx = { 1, 0, -1, 0 };
    static int[] dy = { 0, 1, 0, -1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] s = br.readLine().split(" ");
            int[][] map = new int[Integer.parseInt(s[0])][Integer.parseInt(s[1])];

            int len = Integer.parseInt(s[2]);
            for (int j = 0; j < len; j++) {
                String[] cd = br.readLine().split(" ");
                map[Integer.parseInt(cd[0])][Integer.parseInt(cd[1])] = 1;
            }
            bfs(map);
        }

        System.out.println(sb);

        br.close();
    }

    public static void bfs(int[][] map) {
        int cnt = 0;
        Queue<Integer[]> queue = new LinkedList<>();

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == 0)
                    continue;

                queue.offer(new Integer[] { i, j });
                map[i][j] = 0;

                while (!queue.isEmpty()) {
                    Integer[] q = queue.poll();
                    int x = q[0];
                    int y = q[1];

                    for (int k = 0; k < 4; k++) {
                        int nx = x + dx[k];
                        int ny = y + dy[k];

                        if (nx < 0 || nx >= map.length || ny < 0 || ny >= map[0].length)
                            continue;
                        if (map[nx][ny] == 0)
                            continue;

                        queue.offer(new Integer[] { nx, ny });
                        map[nx][ny] = 0;
                    }
                }
                cnt++;
            }
        }

        sb.append(cnt + "\n");
    }
}