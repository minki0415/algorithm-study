package week7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// n과 m (2)
public class NM2 {
    
    static int[] arr;
	static int n, m; 
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] temp = br.readLine().split(" ");
        n = Integer.parseInt(temp[0]);
        m = Integer.parseInt(temp[1]);

        arr = new int[m];
        
        br.close();
        
        solution(0, 0);
    }

    public static void solution(int index, int num) {

		if (index == m) {
			for (int s : arr) {
				System.out.print(s + " ");
			}
			System.out.println();

		} else {
			for (int i = num+1; i <= n; i++) {
				arr[index] = i;
				solution(index + 1,i);
		
			}
		}

	}
}