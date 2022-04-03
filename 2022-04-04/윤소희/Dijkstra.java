/**
 * Dijkstra
 */
public class Dijkstra {
    private static int[][] graph = { { 1, 2, 3 }, { 1, 3, 2 }, { 1, 4, 5 }, { 2, 3, 2 }, { 2, 5, 8 }, { 3, 4, 2 },
            { 4, 5, 6 }, { 5, 6, 1 } };

    public static void main(String[] args) {

        int[] distance = new int[7];
        boolean[] visited = new boolean[7];

        for (int i = 0; i < 7; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        distance[0] = 0;
        distance[1] = 0;
        visited[0] = true;
        visited[1] = true;

        int start = 1;
        int len = 7;

        while (true) {
            for (int[] node : graph) {
                int s = node[0];
                int e = node[1];
                int w = node[2];
                if (s == start && !visited[e]) {
                    distance[e] = distance[e] > distance[start] + w ? distance[start] + w : distance[e];
                }
            }

            int min = Integer.MAX_VALUE;
            for (int i = 2; i < len; i++) {
                if (visited[i])
                    continue;

                if (min > distance[i]) {
                    min = distance[i];
                    start = i;
                }
            }

            if (min == Integer.MAX_VALUE)
                break;
            visited[start] = true;
        }

        for (int i : distance) {
            System.out.println(i);
        }

    }
}