
/**
 * GasStation
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//import java.util.Arrays;

public class GasStation {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N;
        long[] road;
        long[] gas;

        N = Integer.parseInt(br.readLine());
        road = new long[N - 1];
        gas = new long[N];
        String[] s = br.readLine().split(" ");
        // road = Arrays.stream(s).mapTolong(i -> longeger.parselong(i)).toArray();
        for (int i = 0; i < N - 1; i++) {
            road[i] = Long.parseLong(s[i]);
        }
        s = br.readLine().split(" ");
        // gas = Arrays.stream(s).mapTolong(i -> longeger.parselong(i)).toArray();
        for (int i = 0; i < N; i++) {
            gas[i] = Long.parseLong(s[i]);
        }

        long min = Long.MAX_VALUE;
        long price = 0;

        for (int i = 0; i < road.length; i++) {
            min = min > gas[i] ? gas[i] : min;
            price += min * road[i];
        }

        System.out.print(price);

        br.close();
    }
}