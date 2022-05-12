import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Honeycomb {

    public static int solution(int n) {
        if(n==1) return 1;
        
        int answer = 0;
        long endNum = 1;
        int mul = 0;
        while(true) {
            mul++;
            endNum = endNum + 6 * mul;

            if(endNum >= n) {
                answer = mul + 1;
                break;
            } else {
                continue;
            }
        }

        return answer;
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(solution(n));


    }
}
