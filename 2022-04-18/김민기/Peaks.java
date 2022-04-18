import java.io.IOException;
import java.util.Scanner;

// 봉우리 : 상하좌우 보다 큰 숫자일 경우 봉우리, 봉우리의 개수 구하기 
public class Peaks {

	public static void main(String[] args) throws IOException {
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int [][] arr = new int[n+2][n+2];

		for(int i = 0; i < n+2 ; i++) {
			if(i == 0 || i == n+1) {
				for(int j = 0 ; j < n+2 ; j++) arr[i][j] = 0;
			}else {
				arr[i][0] = 0;
				arr[i][n+1] = 0;
				for(int j = 1; j < n+1; j++) {
					arr[i][j] = kb.nextInt();
			}
			}
		}
		int count = 0;
		for(int i = 1 ; i < n+1 ; i++) {
			for(int j = 1 ; j < n+1 ; j++) {
				if(arr[i][j] > arr[i-1][j] && 
				   arr[i][j] > arr[i+1][j] &&
				   arr[i][j] > arr[i][j-1] &&
				   arr[i][j] > arr[i][j+1]) count++;
			}
		}

		System.out.println(count);
		

		kb.close();

	}
	
}