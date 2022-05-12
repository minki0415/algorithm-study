import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 백준 - 광고
// kmp
// https://hi-spring-night.tistory.com/21
// pi 배열을 생성한 후 전체 길이에서 pi 배열의 맨 끝 수를 빼주면 된다.
public class Advertising {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		char[] arr = br.readLine().toCharArray();
		
		br.close();
		
		solution(arr, L);
        
    }
	
	public static void solution(char[] arr, int L) {

		int[] pi = new int[arr.length];
		int idx = 0;

		for(int i = 1; i < arr.length ; i++) {
			while(idx > 0 && arr[i] != arr[idx]) {

				idx = pi[idx - 1];
			}
			
			if(arr[i] == arr[idx]) {
				pi[i] = ++idx;
			}
		}
		System.out.println(Arrays.toString(pi));
		System.out.println(L-pi[L-1]);

	}
}