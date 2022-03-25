package week2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidPalindrome {

	// 오답
	// public static void main(String[] args) throws IOException {
	//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	// 	String str = br.readLine().toLowerCase();
	// 	String temp = "";

	// 	for(int i = 0; i < str.length(); i++){
	// 		if(Character.isLetter(str.charAt(i))) temp += str.charAt(i);
	// 	}
	// 	System.out.println(temp);

	// 	String answer = "YES";

	// 	int left = 0, right = temp.length()-1;
	// 	while(left < right) { //절반까지만 돌리면 확인 가능
	// 		if(temp.charAt(left) == temp.charAt(right)){
	// 			left++;;
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
		String str = br.readLine().toUpperCase().replaceAll("[^A-Z]", ""); // 정규식을 활용하여 A~Z가 아닌 문자 다 제거
		// System.out.println(str);

		String tmp = new StringBuilder(str).reverse().toString();

		String answer = "NO";
		if(str.equals(tmp)) answer = "YES"; 

		System.out.println(answer);
		

	}
}