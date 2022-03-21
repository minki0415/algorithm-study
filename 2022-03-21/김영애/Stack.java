package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stack {
	
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long N = Long.parseLong(br.readLine());
		
		binary(N);
		
		String reverse = sb.reverse().toString();
		
		System.out.println(reverse);
	}
	
	public static void binary(long N) {
		sb.append(N % 2);
		if (N / 2 == 0) {
			return;
		}
		binary(N / 2);
	}

}
