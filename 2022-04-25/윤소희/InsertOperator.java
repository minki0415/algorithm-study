
// https://www.acmicpc.net/problem/14888
/**
 * InsertOperator
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class InsertOperator {
    static int N;
    static int[] nums;
    static int[] operators;
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    static boolean[] check;

    public static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        nums = new int[N];
        operators = new int[N - 1];
        check = new boolean[N - 1];

        String[] s = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(s[i]);
        }

        s = br.readLine().split(" ");
        int idx = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < Integer.parseInt(s[i]); j++) {
                operators[idx++] = i;
            }
        }

        br.close();
    }

    public static void backTracking(int[] arr, int depth) {
        if (depth == N - 1) {
            checkValue(arr);
            return;
        }

        for (int i = 0; i < operators.length; i++) {
            if (!check[i]) {
                check[i] = true;
                arr[depth] = operators[i];
                backTracking(arr, depth + 1);
                check[i] = false;
            }
        }
    }

    public static void checkValue(int[] arr) {
        int sum = nums[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                sum += nums[i + 1];
            } else if (arr[i] == 1) {
                sum -= nums[i + 1];
            } else if (arr[i] == 2) {
                sum *= nums[i + 1];
            } else if (arr[i] == 3) {
                sum /= nums[i + 1];
            }
        }

        max = max < sum ? sum : max;
        min = min > sum ? sum : min;
    }

    public static void main(String[] args) throws IOException {
        init();
        backTracking(new int[N - 1], 0);

        System.out.println(max);
        System.out.println(min);
    }
}