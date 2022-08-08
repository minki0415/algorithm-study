package baekjoon.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decomposition {

    // 리팩토링
    public static int solution2(int n) {

        int result = 0;

        for(int i = 1; i < n; i++) {

            int sum = 0;
            int quo = i;

            while(quo != 0) {
                sum += quo % 10;
                quo = quo / 10;
            }

            if(sum + i == n) {
                result = i;
                break;
            }

        }

        return result;

    }
    
    public static int solution(int n) {
        int result = 0;

        for(int i = 1; i < n; i++) {

            int sum = 0;
            String s = String.valueOf(i);

            for(int j = 0; j < s.length(); j++) {
                sum += s.charAt(j) - 48;
            }
            
            sum += i;

            if(sum == n) {
                result = i;
                break;
            }

        }

        return result;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(solution2(n));

        br.close();

    }

}
