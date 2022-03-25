package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

	// public static void main(String[] args) throws IOException {
	//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	// 	String str = br.readLine().toLowerCase();

	// 	String answer = "YES";

	// 	int left = 0, right = str.length()-1;
	// 	while(left < str.length()/2) { //절반까지만 돌리면 확인 가능
	// 		if(str.charAt(left) == str.charAt(right)){
	// 			left++;
	// 			right--;
	// 		}else {
	// 			answer = "NO";
	// 			break;
	// 		}
	// 	}

	// 	System.out.println(answer);
	// }

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String answer = "YES";

		String str = br.readLine();
		String rev = new StringBuilder(str).reverse().toString();

		if(!str.equalsIgnoreCase(rev)) answer ="NO"; //equalsIgnoreCase() : 대소문자 상관없이 비교

		System.out.println(answer);
	}
}