package baekjoon.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Balckjack {

    public static int getSum(int n, int m, String str) {

        String[] arr = str.split(" ");
        int max = 0;

        for (int x = 0; x < n - 2; x++) {
            for (int y = x + 1; y < n - 1; y++) {
                for (int z = y + 1; z < n; z++) {
                    int sum = Integer.parseInt(arr[x]) +  Integer.parseInt(arr[y])+ Integer.parseInt(arr[z]);
                    if (sum <= m && sum >= max) {
                        max = sum;
                    }
                }
            }
        }

        return max;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        System.out.println(getSum(n, m, br.readLine()));

    }

}
