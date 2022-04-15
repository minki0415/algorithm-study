package week5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonaci {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] fibonaci = new int[n];

		fibonaci[0] = 1;
		fibonaci[1] = 1;
		
		for(int i = 2; i < n; i++) {
			fibonaci[i] = fibonaci[i-1] + fibonaci[i-2];
		}

		for(int x : fibonaci) {
			System.out.print(x + " ");
		}
	
	}
	// public static void main(String[] args) throws IOException {

	// 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// 	int n = Integer.parseInt(br.readLine());
		
	// 	int a = 1, b = 1, c;
	// 	System.out.print(a + " " + b + " ");
	// 	for(int i = 2; i < n; i++) {
	// 		c = a + b;
	// 		System.out.print(c);
	// 		a = b;
	// 		b = c;
	// 	}
	
	// }
	
}
