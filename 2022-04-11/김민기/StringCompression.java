package week4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringCompression {

	// public static void main(String[] args) throws IOException {
	// 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     String s = br.readLine();
	// 	StringBuilder sb = new StringBuilder();
	// 	int count = 1;
	// 	for(int i = 0 ; i < s.length() ; i++) {

	// 		if(i == s.length()-1) {

	// 			if(s.charAt(i) == s.charAt(i-1)){
	// 				sb.append(s.charAt(i));
	// 				sb.append(count);
	// 			}else{
	// 				sb.append(s.charAt(i));
	// 			}
				
	// 		}
	// 		else if(s.charAt(i) == s.charAt(i+1)){
	// 			count++;
	// 		}else if(s.charAt(i) != s.charAt(i+1)){
	// 			sb.append(s.charAt(i));
	// 			if(count > 1) sb.append(count);
	// 			count = 1;
	// 		}
	// 	}

	// 	System.out.println(sb);
	// }

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

		String answer ="";

		s = s + " ";
		int count = 1;
		for(int i = 0; i < s.length()-1; i++){
			if(s.charAt(i) == s.charAt(i+1)) count++;
			else{
				answer += s.charAt(i);
				if(count > 1) answer += String.valueOf(count);
				count = 1;
			}
		}

		System.out.println(answer);
	}
}