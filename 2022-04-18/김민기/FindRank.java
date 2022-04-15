package week5;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FindRank {

	public static void main(String[] args) throws IOException {
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];

		for(int i = 0; i < n ; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}

		System.out.println(Arrays.deepToString(arr));

		

		kb.close();

	}
	
}