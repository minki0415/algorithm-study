package baekjoon.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chess {
    
    static int min = 64;
    static boolean[][] arr;

    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // true : B, false = 'W'
        arr = new boolean[n][m];

        for(int i = 0; i < n; i++) {
            String str = br.readLine();

            for(int j = 0; j < m; j++) {
                if(str.charAt(j) == 'B') {
                    arr[i][j] = true;
                } 
            }
        }

        int row = n - 7;
        int col = m - 7;

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                find(i, j);
            }
        }

        System.out.println(min);
        
        br.close();
    }

    public static void find(int r, int c) {
        
        int end_row = r + 8;
        int end_col = c + 8;
        int cnt = 0;

        boolean tf = arr[r][c];

        for(int i = r; i < end_row; i++) {
            for(int j = c; j <end_col; j++) { 
                if(arr[i][j] != tf) {
                    cnt++;
                }

                tf = !tf;
            }

            tf = !tf;
        }

        cnt = cnt <= 64 - cnt ? cnt : 64 - cnt;
        min = min <= cnt ? min : cnt;

    }

}
