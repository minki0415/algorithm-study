import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BreakEvenPoint {

    public static long solution(int a, int b, int c) {
        long num = 0;

        if(b >= c) {
            return -1;
        } else {
            while(true) {
                num++;
                if(a + b * num < c * num) {
                    break;
                } 
            }
        }

        return num;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        System.out.println(solution(a, b, c));
    }
    
}
