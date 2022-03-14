package codes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

// 소인수분해
public class PrimeFactorization {
	
	public static ArrayList<Integer> solution(int n) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		int sq = (int)Math.sqrt(n);
		
		for (int i = 2; i <= sq; i++) {
			while (n % i == 0) {
				al.add(i);
				n /= i;
			}
		}
		
		if (n != 1) {
			al.add(n);
		}
		
		return al;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		
		
		for(int i : solution(n)) {
			System.out.println(i);
		}
		
		in.close();
		
	}
	
}
