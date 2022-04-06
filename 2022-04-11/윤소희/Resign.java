// 문제 : https://www.acmicpc.net/problem/14501

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Resign {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N;
        int[] T;
        int[] P;
        int[] dp;

        N = Integer.parseInt(br.readLine());
        T = new int[N];
        P = new int[N];
        dp = new int[N + 5];

        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            T[i] = Integer.parseInt(s[0]);
            P[i] = Integer.parseInt(s[1]);
        }

        for (int i = 0; i < N; i++) {
            dp[i + T[i]] = Math.max(dp[i + T[i]], dp[i] + P[i]);
            // for (int j = i + T[i] + 1; j < N + 5; j++) {
            // dp[j] = Math.max(dp[j], dp[i + T[i]]);
            // }
            dp[i + 1] = Math.max(dp[i], dp[i + 1]);
        }

        System.out.println(dp[N]);

        br.close();
    }
}
