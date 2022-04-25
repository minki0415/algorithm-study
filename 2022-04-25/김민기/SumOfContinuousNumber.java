package week6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 연속된 자연수의 합
public class SumOfContinuousNumber {

	public static int solution(int n) {

		int answer = 0;
		
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = i+1;
		}

		int lt = 0, sum = 0;
		for(int rt = 0 ; rt < n/2+1 ; rt++) {
			sum += arr[rt];
			if(sum == n) answer++;
			while(sum >= n) {
				sum -= arr[lt++];
				if(sum == n) answer++;
			}
		}

		return answer;
	}


	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		System.out.println(solution(n));

	}
	
}