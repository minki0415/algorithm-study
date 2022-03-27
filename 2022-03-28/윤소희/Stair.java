import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Stair {
    static int n;
    static int[] stair;
    static int[] stair2;

    public static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        stair = new int[n];
        stair2 = new int[n];

        for (int i = 0; i < n; i++) {
            int score = Integer.parseInt(br.readLine());
            stair[i] = score;
            stair2[i] = score;
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();

        if (n >= 2)
            stair[1] += stair[0];

        for (int i = 2; i < n; i++) {
            stair[i] += stair2[i - 1];
            stair2[i] += Math.max(stair[i - 2], stair2[i - 2]);
        }

        System.out.println(Math.max(stair[n - 1], stair2[n - 1]));
    }
}
