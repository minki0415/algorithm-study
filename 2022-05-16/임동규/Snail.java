package baekjoon.basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Snail {

    public static int solution(int a, int b, int v) {

        if(a == v) return 1;

        int cnt = 0;
        int day = a - b;
        int tmp = v - a;

        if(tmp % day == 0) {
            cnt = tmp / day + 1;
        } else {
            cnt = tmp / day + 1 + 1;
        }

        return cnt;
    }

    public static int solution2(int a, int b, int v) {

        if(a == v) return 1;

        int cnt = 0;
        int day = a - b;
        int tmp = v - b;

        if(tmp % day == 0) {
            cnt = tmp / day;
        } else {
            cnt = tmp / day + 1;
        }

        return cnt;
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        System.out.println(solution(a, b, v));
        
        // # 시간 초과
        // int t = 0;
        // int day = 0;
        // while(true) {
        //     day++;
        //     t += a;

        //     if(t >= v) {
        //         break;
        //     } else {
        //         t -= b;
        //     }
        // }

        // System.out.println(day);
    }
}
