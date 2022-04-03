package week3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharDistance {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strs = br.readLine().split(" ");

		String str = strs[0];
		char c = strs[1].charAt(0);
		int[] answer = new int[str.length()];

		//순방향으로 t 문자와의 거리 확인
		int p = 1000;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c) {
				p = 0;
				answer[i] = p; 
			} else {
				p++;
				answer[i] = p;
			}
		}

		// 역방향으로 t 문자와의 거리 확인
		p = 1000;
		for(int i = str.length()-1; i >= 0; i--) {
			if(str.charAt(i) == c){
				p = 0;
				if(answer[i] > p){
					answer[i] = p;
				}
			} else {
				p++;
				if(answer[i] > p) {
					answer[i] = p;
				}
			}
		}

		for(int x : answer) {
			System.out.print(x+ " ");
		}

	}
}