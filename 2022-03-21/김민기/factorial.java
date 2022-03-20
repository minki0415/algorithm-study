import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
 
        if(n == 0 || n == 1){
            return 1;
        }else {
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        input.close();
        System.out.println(factorial(n));
    }
}
