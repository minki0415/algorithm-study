package week3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stairs {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
		int[] score = new int[n];

		for(int i = 0; i < n; i++) {
			score[i] = Integer.parseInt(br.readLine());
		}

		int[] dp = new int[n];

		dp[0] = score[0];

		if(n > 2) {
			for(int i = 1; i < 3; i++) {
				if (i == 1) {
					dp[1] = Math.max(dp[i-1] + score[i], score[i]);
				}else {
					dp[i] = Math.max(dp[i-2] + score[i], score[i-1] + score[i]);
				}
			}
	
			for(int i = 3; i < n ; i++) {
				dp[i] = Math.max(dp[i-2] + score[i], dp[i-3] + score[i-1] + score[i]);
			}

			System.out.println(dp[n-1]);

		}else if(n == 1) System.out.println(dp[0]);
		else {
			System.out.println(dp[0] + score[1]);
		} 
		
	}
}