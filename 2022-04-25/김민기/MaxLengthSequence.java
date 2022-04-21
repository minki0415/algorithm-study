package week6;
import java.io.IOException;
import java.util.Scanner;

// 최대 길이 연속부분수열
public class MaxLengthSequence {

	public static int solution(int n, int k, int[] arr) {

		int answer = 0;

		int rt = 0;
		for(int lt = 0 ; lt < n ; lt++) {
			int temp = 0; // 각 lt 마다 길이
			int count = 0;
			rt = lt;
			while(count <= k && rt < n) {
				if(arr[rt] == 1) {
					temp++;
					rt++;
				}else {
					count++;
					temp++;
					rt++;
				}
			}
			answer = Math.max(answer, temp-1);
		}

		return answer;
	}


	public static void main(String[] args) throws IOException {
		
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int k = kb.nextInt();

		int [] arr = new int[n];
		for(int i = 0 ; i < n ; i ++) {
			arr[i] = kb.nextInt();
		}

		System.out.println(solution(n, k, arr));

		kb.close();

	}
	
}