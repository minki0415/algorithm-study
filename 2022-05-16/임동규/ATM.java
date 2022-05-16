package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class ATM {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        PriorityQueue<Integer> que = new PriorityQueue<>();
        
        for(int i = 0; i < n; i++) {
            que.offer(Integer.parseInt(st.nextToken()));
        }
        
        int sum = 0;
        int total = 0;

        while(!que.isEmpty()) {
            sum += que.poll();
            total += sum;
        }
        
        System.out.println(total);

        br.close();
    }
}
