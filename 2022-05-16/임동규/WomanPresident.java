package baekjoon.basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WomanPresident {

    // # 재귀 - 시간 오래 걸림
    public static int rec(int k, int n) {
        int sum = 0;

        if(k == 0) {
            sum = n;
        } else {
            for(int i = 1; i <= n; i++) {
                sum += rec(k-1, i);
            }
        }

        return sum;
    }

    // # 이중 loop
    public static int doubleLoop(int k, int n) {
        int[] num = new int[n];
        for(int i = 0; i < n; i++) {
            num[i] = i + 1;
        }

        for(int i = 0; i < k; i++) {
            for(int j = 1; j < n; j++) {
                num[j] = num[j-1] + num[j];
            }
        }

        return num[n-1];
    }



    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(doubleLoop(k, n));
            // System.out.println(rec(k, n));
        }

        br.close();
    }
    
}
