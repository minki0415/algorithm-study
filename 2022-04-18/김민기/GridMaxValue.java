import java.io.IOException;
import java.util.Scanner;

public class GridMaxValue {

	// public static void main(String[] args) throws IOException {
		
	// 	Scanner kb = new Scanner(System.in);
	// 	int n = kb.nextInt();
	// 	int [][] arr = new int[n][n];

	// 	for(int i = 0; i < n ; i++) {
	// 		for(int j = 0; j < n; j++) {
	// 			arr[i][j] = kb.nextInt();
	// 		}
	// 	}

	//  int sum1, sum2;
	// 	ArrayList<Integer> answers = new ArrayList<Integer>();
	// 	for(int i =0 ; i < n ; i ++) {
	// 		sum1 = sum2 = 0;
	// 		for(int j = 0; j < n; j++)  {
	// 			sum1 += arr[i][j];
	// 			sum2 += arr[j][i];
	// 		}
	// 		answers.add(sum1);
	// 		answers.add(sum2);
	// 	}

	// 	sum1 = sum2 = 0;
	// 	for(int i = 0 ; i < n ; i ++) {
	// 		sum1 += arr[i][i];
	// 		sum2 += arr[i][n-i-1];
	// 	}
	// 	answers.add(sum1);
	// 	answers.add(sum2);

	// 	System.out.println(Collections.max(answers));

	// 	kb.close();

	// }
	public static void main(String[] args) throws IOException {
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int [][] arr = new int[n][n];

		for(int i = 0; i < n ; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}

		int answer = Integer.MIN_VALUE;
		int sum1, sum2;
		for(int i = 0; i < n; i++){
			sum1 = sum2 = 0;
			for(int j = 0 ; j < n ; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			answer= Math.max(answer, sum1);
			answer= Math.max(answer, sum2);
		}

		sum1 = sum2 = 0;
		for(int i = 0 ; i < n ; i++) {
			sum1 += arr[i][i];
			sum2 += arr[i][n-i-1];
		}
		answer= Math.max(answer, sum1);
		answer= Math.max(answer, sum2);

		System.out.println(answer);

		kb.close();

	}
	
}