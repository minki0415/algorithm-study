package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CuttingLANCode {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] lanCode = new int[k];

        long max = 0;

        for(int i = 0; i < lanCode.length; i++) {
            lanCode[i] = Integer.parseInt(br.readLine());
            if(max < lanCode[i]) {
                max = lanCode[i];
            }
        }

        max++;

        long min = 0;
        long mid = 0;
        
        while(min < max) {
            
            mid = (max + min) / 2;
            long cnt = 0;
            
            for(int i = 0; i < lanCode.length; i++) {
                cnt += lanCode[i] / mid;
            }

            if(cnt < n) {
                max = mid;
            } else {
                min = mid + 1;
            }

        }

        System.out.println(min - 1);

        br.close();

    }

}
