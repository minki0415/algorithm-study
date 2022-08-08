//https://www.acmicpc.net/problem/1931

/**
 * MeetingRoom
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoom {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;
        int N = Integer.parseInt(br.readLine());

        int[][] meetings = new int[N][2];

        for (int i = 0; i < N; i++) {
            int[] meeting = Arrays.stream(br.readLine().split(" ")).mapToInt(s -> Integer.parseInt(s)).toArray();
            meetings[i] = meeting;
        }

        // 끝나는 시간 기준 오름차순 정렬
        // 끝나는 시간이 같으면, 빨리 시작하는 순으로 정렬
        // 시작하자마자 끝나는 경우도 있기때문,,,
        /*
         * 반례
         * 2
         * 1 1
         * 0 1
         */
        Arrays.sort(meetings, new Comparator<int[]>() {
            @Override
            public int compare(int[] i1, int[] i2) {
                if (i1[1] == i2[1]) {
                    return i1[0] - i2[0];
                } else {
                    return i1[1] - i2[1];
                }
            }
        });

        int time = -1;
        for (int[] i : meetings) {
            // 이전 회의가 끝난 시간보다 시작 시간이 같거나 큰 경우에 카운트
            if (i[0] >= time) {
                cnt++;
                time = i[1];
            }
        }

        System.out.println(cnt);

        br.close();
    }
}