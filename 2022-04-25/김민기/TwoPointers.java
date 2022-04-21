package week6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


// Two Pointers Algorithm
public class TwoPointers {

	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
		ArrayList<Integer> answer = new ArrayList<>();

		int p1 = 0, p2 = 0;
		while(p1 < n && p2 < m) {
			if(a[p1] < b[p2]) answer.add(a[p1++]);
			else answer.add(b[p2++]);
		}
		while(p1 < n) answer.add(a[p1++]);
		while(p2 < m) answer.add(b[p2++]);

		return answer;
	}

	public static void main(String[] args) throws IOException {
		
		TwoPointers T = new TwoPointers();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int [] arr1 = new int[n];
		for(int i = 0 ; i < n ; i ++) {
			arr1[i] = kb.nextInt();
		}

		int m = kb.nextInt();
		int [] arr2 = new int[m];
		for(int i = 0 ; i < m ; i ++) {
			arr2[i] = kb.nextInt();
		}

		for(int x : T.solution(n, m , arr1, arr2)) System.out.print(x + " ");

		kb.close();

	}

	// public static void main(String[] args) throws IOException {
		
	// 	Scanner kb = new Scanner(System.in);

	// 	int n = kb.nextInt();
	// 	int [] arr1 = new int[n];
	// 	for(int i = 0 ; i < n ; i ++) {
	// 		arr1[i] = kb.nextInt();
	// 	}

	// 	int m = kb.nextInt();
	// 	int [] arr2 = new int[m];
	// 	for(int i = 0 ; i < m ; i ++) {
	// 		arr2[i] = kb.nextInt();
	// 	}

	// 	int[] answer = new int[n+m];
	// 	for(int i = 0 ; i < n ; i ++) {
	// 		answer[i] = arr1[i];
	// 	}
	// 	for(int j = 0 ; j < m ; j++) {
	// 		answer[n+j] = arr2[j];
	// 	}

	// 	Arrays.sort(answer);

	// 	StringBuilder sb = new StringBuilder();

	// 	for(int i = 0 ; i < n+m ; i++) {
	// 		if(i == n+m-1) {
	// 			sb.append(answer[i]);
	// 		}else {
	// 			sb.append(answer[i]);	
	// 			sb.append(" ");
	// 		}
	// 	}


	// 	System.out.println(sb.toString());
	// 	kb.close();

	// }
	
}