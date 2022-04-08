
// 문제 : https://www.acmicpc.net/problem/10162
/**
 * MicrowaveOven
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MicrowaveOven {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[] buttons = new int[3];
        int[] times = { 300, 60, 10 };

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] += T / times[i];
            T %= times[i];
        }

        if (T != 0) {
            System.out.println(-1);
        } else {
            for (int i : buttons)
                System.out.print(i + " ");
        }

        br.close();
    }
}