//문제 : https://www.acmicpc.net/problem/12026

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class BOJStreet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        ArrayList<Integer> arrB = new ArrayList<>();
        ArrayList<Integer> arrO = new ArrayList<>();
        ArrayList<Integer> arrJ = new ArrayList<>();

        int[] dp = new int[N];
        dp[0] = 0;
        arrB.add(0);

        for (int i = 1; i < N; i++) {
            char now = str.charAt(i);
            int min = Integer.MAX_VALUE;

            if (now == 'B') {
                if (arrJ.size() > 0) {
                    for (Integer m : arrJ) {
                        int temp = dp[m] + (i - m) * (i - m);
                        min = min > temp ? temp : min;
                    }
                    arrB.add(i);
                }
            } else if (now == 'O') {
                if (arrB.size() > 0) {
                    for (Integer m : arrB) {
                        int temp = dp[m] + (i - m) * (i - m);
                        min = min > temp ? temp : min;
                    }
                    arrO.add(i);
                }
            } else if (now == 'J') {
                if (arrO.size() > 0) {
                    for (Integer m : arrO) {
                        int temp = dp[m] + (i - m) * (i - m);
                        min = min > temp ? temp : min;
                    }
                    arrJ.add(i);
                }
            }

            if (min == Integer.MAX_VALUE)
                min = 0;

            dp[i] = min;
        }

        if (N != 1 && dp[N - 1] == 0)
            dp[N - 1] = -1;

        System.out.println(dp[N - 1]);

        br.close();
    }
}
