import java.util.HashSet;

public class NExpression {
    public static void main(String[] args) {
        System.out.println(solution(5, 12));
    }

    public static int solution(int N, int number) {

        HashSet<Integer>[] dp = new HashSet[8];

        int n = 0;
        for (int i = 0; i < 8; i++) {
            n += Math.pow(10, i) * N;
            dp[i] = new HashSet<Integer>();
            dp[i].add(n);
        }

        dp[1].add(N + N);
        dp[1].add(N * N);
        dp[1].add(N / N);

        for (int i = 2; i < 8; i++) {
            for (int j = 0; j < i; j++) {
                for (int a : dp[j]) {
                    for (int b : dp[i - j - 1]) {
                        dp[i].add(a + b);
                        dp[i].add(a * b);
                        if (a - b > 0)
                            dp[i].add(a - b);
                        if (a / b > 0)
                            dp[i].add(a / b);
                    }
                }
            }
        }

        for (int i = 0; i < 8; i++) {
            if (dp[i].contains(number))
                return i + 1;
        }

        return -1;
    }
}
