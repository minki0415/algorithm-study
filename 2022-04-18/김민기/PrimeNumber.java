package week5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] isPrime = new int[N+1];
		
		isPrime[0] = isPrime[1] = 1;

		for(int i = 2; i < N; i++) {
			if(isPrime[i] == 0) {
				for(int j = i+i ; j <= N; j = j+i) {
					isPrime[j] = 1;
				}
			}
		}

		int result = 0;
		for(int x : isPrime) {
			if(x == 0) {
				result++;
			}
		}
		System.out.println(result);

	}
	
}