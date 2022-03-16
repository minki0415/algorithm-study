//문제 : https://www.acmicpc.net/problem/10872

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Factorial {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());

        System.out.println(recursion(N));

        br.close();
    }

    public static long recursion(long n) {
        if (n <= 1) {
            return 1;
        }

        return n * recursion(n - 1);
    }
}
