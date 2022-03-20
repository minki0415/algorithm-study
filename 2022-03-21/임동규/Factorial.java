package codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
	
	public static int solution(int n) {
		if(n==0 || n==1) {
			return 1;
		} else {
			return n * solution(n-1);
		}
	}
	
	public static void main(String[] args) throws IOException {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println(solution(sc.nextInt()));
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		System.out.println(solution(n));
		
		in.close();
	}

}
