package week5;
import java.io.IOException;
import java.util.Scanner;

public class CalculateScore {

	public static void main(String[] args) throws IOException {
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		int[] temp = new int[n];
		temp[0] = arr[0] == 1 ? 1 : 0;  


		for(int i = 1 ; i < n ; i++) {
			if(arr[i] == 0) temp[i] = 0;
			else if(arr[i-1] == 0 && arr[i] == 1) temp[i] = 1;
			else temp[i] = temp[i-1] + 1; 
		}

		int answer = 0;
		for(int i = 0 ; i < n ; i++) {
			answer += temp[i];
		}

		
		System.out.println(answer);

		kb.close();

	}
	
}