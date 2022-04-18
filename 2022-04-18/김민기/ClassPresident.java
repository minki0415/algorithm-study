import java.io.IOException;
import java.util.Scanner;

//임시반장 정하기
public class ClassPresident {

	public static void main(String[] args) throws IOException {
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int [][] arr = new int[n][5];

		for(int i = 0; i < n ; i++) {
			for(int j = 0 ; j < 5 ; j++) arr[i][j] = kb.nextInt();
		}

		// System.out.println(Arrays.deepToString(arr));
		
		int answer = 0;
		int max = Integer.MIN_VALUE;

		for(int i = 0 ; i < n ; i++) { 			// i번 학생
			int cnt = 0;
			for(int j = 0 ; j < n ; j++) { 		// j학년
				for(int k = 0 ; k < 5 ; k++) {  // k번 학생
					if(arr[i][k] == arr[j][k]) {
						cnt ++;
						break;
					}
				}
			}
			if(cnt > max) {
				max = cnt;
				answer = i+1;
			}
		}

		System.out.println(answer);

		kb.close();

	}
	
}