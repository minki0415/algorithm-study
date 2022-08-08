package baekjoon.basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class PrimeNumber {

    public static boolean isPrimeNumber(int n) {
        if(n == 1) {
            return false;
        }

        boolean result = true;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                result = false;
            }   
        }
        
        return result;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> que = new LinkedList<>();

        for(int i = m; i <= n; i++) {
            if(isPrimeNumber(i)) {
                que.offer(i);
            }
        }

        if(que.isEmpty()) {
            System.out.println(-1);
            br.close();
            System.exit(0);
        } else {
            int min = que.peek();
            int sum = 0;

            while(!que.isEmpty()) {
                sum += que.poll();
            }
                            
            System.out.println(sum);
            System.out.println(min);

            br.close();
        }

    }    
}