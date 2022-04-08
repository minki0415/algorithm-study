package week2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FlipWords {

    // public static void main(String[] args) throws Exception {
    // 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
	// 	Integer N = Integer.parseInt(br.readLine());
	// 	String[] strs = new String[N];

	// 	for(int i = 0; i < N; i++) {
	// 		strs[i] = br.readLine();
	// 	}

	// 	for(int i = 0; i < N; i++){
	// 		StringBuffer sb = new StringBuffer(strs[i]);
	// 		System.out.println(sb.reverse().toString());
	// 	}
	// }

	// public static void main(String[] args) throws IOException {

    // 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
	// 	Integer N = Integer.parseInt(br.readLine());
	// 	String[] strs = new String[N];

	// 	for(int i = 0; i < N; i++) {
	// 		strs[i] = br.readLine();
	// 	}

	// 	ArrayList<String> answer = new ArrayList<>();
	// 	for(String x : strs) {
	// 		String tmp = new StringBuilder(x).reverse().toString();
	// 		answer.add(tmp);
	// 	}

	// 	System.out.println(answer);
	// }

	public static void main(String[] args) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		Integer N = Integer.parseInt(br.readLine());
		String[] strs = new String[N];

		for(int i = 0; i < N; i++) {
			strs[i] = br.readLine();
		}

		ArrayList<String> answer = new ArrayList<>();
		for(String x : strs) {
			char[] s = x.toCharArray();
			int lt = 0, rt = x.length()-1;
			while(lt < rt){
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--; 
			}
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}

		System.out.println(answer);
	}
}