// 문제 : https://www.acmicpc.net/problem/14889

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class StartAndLink {
    private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] S = new int[N][N];

        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                S[i][j] = Integer.parseInt(s[j]);
            }
        }

        recursion(new Integer[N / 2], 0, N, 0, S);
        System.out.println(min);

        br.close();
    }

    public static void recursion(Integer[] arr, int start, int N, int depth, int[][] S) {
        if (depth == N / 2) {
            Integer[] newArr = new Integer[N / 2];

            for (int i = 0; i < N / 2; i++) {
                newArr[i] = arr[i];
            }

            findMinStatus(newArr, S, N);

            return;
        }

        for (int i = start; i < N; i++) {
            arr[depth] = i;
            recursion(arr, i + 1, N, depth + 1, S);
        }
    }

    public static void findMinStatus(Integer[] arr, int[][] S, int N) {
        int status = 0;
        int status2 = 0;
        ArrayList<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < N; i++)
            arrList.add(i);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                status += S[arr[i]][arr[j]];
                status += S[arr[j]][arr[i]];
            }
            arrList.remove(arr[i]);
        }

        for (int i = 0; i < N / 2; i++) {
            for (int j = i + 1; j < N / 2; j++) {
                status2 += S[arrList.get(i)][arrList.get(j)];
                status2 += S[arrList.get(j)][arrList.get(i)];
            }
        }

        int sub = Math.abs(status2 - status);
        min = min > sub ? sub : min;
    }
}
