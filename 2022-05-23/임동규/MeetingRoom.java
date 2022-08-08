package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class MeetingRoom {
    
    public static int solution(int[][] time) {

        int cnt = 0;
        int pre_end_time = 0;

        for(int i = 0; i < time.length; i++) {

            if(pre_end_time <= time[i][0]) {
                pre_end_time = time[i][1];
                cnt++;
            }
 
         }
        
         return cnt;

    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] time = new int[n][2];

        StringTokenizer st = null;

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }

        // 끝나는 시간 기준으로 오름차순 정렬
        Arrays.sort(time, new Comparator<int[]>() {
            
            @Override
            public int compare(int[] t1, int[] t2) {

                if(t1[1] == t2[1]) {
                    return t1[0] - t2[0];
                }

                return t1[1] - t2[1];
            }

        });

        System.out.println(solution(time));

    }

}
