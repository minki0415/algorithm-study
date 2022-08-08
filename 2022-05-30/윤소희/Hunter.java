import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Hunter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M, N, L;
        int[] pos;
        int[][] animal;

        String[] s = br.readLine().split(" ");

        M = Integer.parseInt(s[0]);
        N = Integer.parseInt(s[1]);
        L = Integer.parseInt(s[2]);

        pos = new int[M];
        animal = new int[N][2];

        s = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            pos[i] = Integer.parseInt(s[i]);
        }

        Arrays.sort(pos);

        for (int i = 0; i < N; i++) {
            s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);

            animal[i] = new int[] { x, y };
        }

        int answer = 0;

        for (int[] ani : animal) {
            int x = ani[0];
            int y = ani[1];

            int left = 0;
            int right = pos.length - 1;

            if (y > L)
                continue;

            while (left <= right) {
                int mid = (left + right) / 2;

                if (Math.abs(pos[mid] - x) + y <= L) {
                    answer++;
                    break;
                } else {
                    if (x < pos[mid]) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
            }
        }

        System.out.println(answer);

        br.close();
    }
}
