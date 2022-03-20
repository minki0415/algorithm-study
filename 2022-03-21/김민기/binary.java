import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        toBinary(n);
        br.close();
    }
    
    public static void toBinary(long n) {

        if(n == 0) return;
        else {
            toBinary(n / 2);
            System.out.print(n % 2);
        }
    }
}