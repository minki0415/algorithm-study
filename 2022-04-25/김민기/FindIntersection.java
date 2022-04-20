package week6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindIntersection {

	public static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
		ArrayList<Integer> answer = new ArrayList<>();

		Arrays.sort(a);
		Arrays.sort(b);

		int p1 = 0, p2 = 0;
		while(p1 < n && p2 < m) {
			if(a[p1] == b[p2]) {
				answer.add(a[p1++]);
				p2++;
			}else if(a[p1] < b[p2]) p1++;
			else p2++;
		}


		return answer;
	}
	// public static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
	// 	ArrayList<Integer> answer = new ArrayList<>();

	// 	Arrays.sort(a);
	// 	Arrays.sort(b);

	// 	int p1 = 0, p2 = 0;
	// 	while(p1 < n) {
	// 		if(a[p1] == b[p2]) {
	// 			answer.add(a[p1++]);
	// 			p2 = 0;
	// 		}
	// 		else if(p2 == m-1) {
	// 			p2 = 0;
	// 			p1++;
	// 		}
	// 		else p2++;
	// 	}


	// 	return answer;
	// }

	public static void main(String[] args) throws IOException {
		
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

		for(int x : solution(n, m, arr1, arr2))	System.out.print(x + " ");

		kb.close();

	}
	
}