package codes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ClimbingStairs {
	public static int solution() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int n = Integer.parseInt(br.readLine());

			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			
			if(n == 1) {
				return arr[0];
			} else if(n == 2) {
				return arr[0] + arr[1];
			} else {
				int[] m = new int[n];
				m[0] = arr[0];
				m[1] = arr[0] + arr[1];
				m[2] = Math.max(arr[0], arr[1]) + arr[2];
				for (int i = 3; i < n; i++) {
					m[i] = Math.max(m[i - 2], m[i - 3] + arr[i - 1]) + arr[i];
				}
				
				br.close();
				
				return m[n-1];
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return -1; 
	}

	public static void main(String[] args) {
		System.out.println(solution());
	}

}
