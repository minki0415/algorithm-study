import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindingFraction {

    public static int sum(int n) {
        return (1 + n) * n / 2;
    }
    
    public static String solution(String n) {
        String result = "";
        
        try {
            int k = Integer.parseInt(n);
            int i = 1;

            while(k > sum(i)) {
                ++i;
            }

            int m = k - sum(i-1) - 1;
            if(i % 2 == 0) {
                result = String.valueOf(1 + m) +  "/" + String.valueOf(i - m);
            } else {
                result = String.valueOf(i - m) +  "/" + String.valueOf(1 + m);
            }      
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력하세요.");
            e.printStackTrace(); 
        }

        return result;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        System.out.println(solution(n));

        br.close();
    }
}