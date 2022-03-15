
//문제 : https://www.acmicpc.net/problem/10829
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Binary {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());
        Stack<Long> binary = new Stack<>();

        while (N >= 1) {
            binary.add(N % 2);
            N /= 2;
        }

        while (!binary.isEmpty()) {
            System.out.print(binary.pop());
        }

        br.close();
    }
}
