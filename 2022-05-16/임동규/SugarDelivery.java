package baekjoon.basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SugarDelivery {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int q = n / 5;
        int r = n % 5;

        if(n == 4 || n == 7) {
            System.out.println(-1);
        } else if(r == 0) {
            System.out.println(q);
        } else if(r == 1 || r == 3) {
            System.out.println(q + 1);
        } else {
            // n % 5 == 2 || n % 5 == 4
            System.out.println(q + 2);
        }

        br.close();
    }

}
