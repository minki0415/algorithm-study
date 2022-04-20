package week6;
import java.io.IOException;
import java.util.Scanner;

//Sliding Window
public class SlidingWindow {

	public static int solution(int n, int k, int[] arr) {

		int answer = 0, temp = 0;
		for(int i = 0 ; i < k ; i++) temp += arr[i];
		
		for(int i = k ; i < n ; i++) {
			temp += (arr[i] - arr[i-k]);
			answer = Math.max(answer, temp);
		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		// int[] nums2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

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