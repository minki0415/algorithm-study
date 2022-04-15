package week5;

import java.io.IOException;
import java.util.Scanner;

public class PrintBigNumber {

	public static void main(String[] args) throws IOException {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		for(int i = 0; i < n ; i++) {
			if(i == 0) System.out.print(arr[i]);
			else if(arr[i-1] < arr[i]) System.out.print(" " + arr[i]);
		}

		kb.close();

	}
}