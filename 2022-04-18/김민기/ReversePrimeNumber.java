package week5;
import java.io.IOException;
import java.util.Scanner;

public class ReversePrimeNumber {

	public static boolean isPrime(int n) {
		boolean result = true;

		if(n <= 1)  result = false;
		if(n == 2) result = true;
		for(int i = 2 ; i < n ; i++) {
			if(n % i == 0) {
				result = false;
			}
		}

		return result;
	}

	public static void main(String[] args) throws IOException {
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];


		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		// 숫자 뒤집기
		for(int i = 0 ; i < n ; i++) {
			int tmp = arr[i];
			int res = 0;
			while(tmp > 0) {
				int t = tmp % 10;
				res = res * 10 + t;
				tmp = tmp / 10;
			}

			if(isPrime(res)) System.out.print(res+" ");
		}

		kb.close();


	}
	
}