import java.io.IOException;
import java.util.Scanner;

//Two Pointers algorithm
//Sliding Window
public class ContinuousPartialSequence {

	public static int solution(int n, int m, int[] arr) {

		int answer = 0, lt = 0, sum = 0;
		for(int rt = 0 ; rt < n ; rt++) {
			sum += arr[rt];
			if(sum == m) answer++;
			while(sum >= m) {
				sum -= arr[lt++];
				if(sum == m) answer++;
			}
		}
		
		return answer;
	}

	// public static int solution(int n, int m, int[] arr) {

	// 	int answer = 0, temp = 0;
	// 	for(int i = 0 ; i < n ; i++) {
	// 		temp = arr[i];
	// 		for(int j = i+1 ; j < n ; j++) {
	// 			if(temp == m) {
	// 				answer++;
	// 				break;
	// 			}else if(temp < m) {
	// 				temp += arr[j];
	// 			}else {
	// 				break;
	// 			}
	// 		}
	// 	}
		

	// 	return answer;
	// }

	public static void main(String[] args) throws IOException {
		
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		// int[] nums2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int m = kb.nextInt();

		int [] arr = new int[n];
		for(int i = 0 ; i < n ; i ++) {
			arr[i] = kb.nextInt();
		}

		System.out.println(solution(n, m, arr));

		kb.close();

	}
	
}