
// https://www.acmicpc.net/problem/1654
/**
 * LAN
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LAN {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K, N;
        int[] lans;

        String[] s = br.readLine().split(" ");

        K = Integer.parseInt(s[0]);
        N = Integer.parseInt(s[1]);

        lans = new int[K];
        long sum = 0;

        for (int i = 0; i < K; i++) {
            lans[i] = Integer.parseInt(br.readLine());
            sum += lans[i];
        }

        long left = 1;
        long right = sum / N;
        long middle = 0;
        long answer = 0;

        while (left <= right) {
            middle = (left + right) / 2;
            int cnt = 0;

            for (int i : lans) {
                cnt += i / middle;
            }

            if (cnt < N) {
                right = middle - 1;
            } else {
                left = middle + 1;
                answer = middle;
            }
        }

        System.out.println(answer);

        br.close();
    }
}