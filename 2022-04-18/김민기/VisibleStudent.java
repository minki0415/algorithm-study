package week5;

import java.io.IOException;
import java.util.Scanner;

public class VisibleStudent {

	public static void main(String[] args) throws IOException {
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];

		int count = 0;
		int max = 0;

		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		for(int i = 0; i < n ; i++) {
			if(i == 0) {
				max = arr[i];
				count++;
			}
			else if(arr[i] > max) {
				max = arr[i];
				count++;
			}
		}

		System.out.println(count);

		kb.close();
	}
}