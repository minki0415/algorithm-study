package week2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CaseConversion {

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
		StringBuilder sb = new StringBuilder();

		for(char x : str1.toCharArray()) {
			if(Character.isUpperCase(x)) {
				sb.append(Character.toLowerCase(x));
			} else {
				sb.append(Character.toUpperCase(x));
			}
		}
		System.out.println(sb);

    }
	
	// public static void main(String[] args) throws Exception {
    // 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
    //     String str1 = br.readLine();
	// 	String answer = "";

	// 	for(char x : str1.toCharArray()) {
	// 		if(Character.isUpperCase(x)) answer+=Character.toUpperCase(x);
	// 		else answer+=Character.toLowerCase(x);;	
	// 	}
	// 	System.out.println(answer);

    // }
	
	// 대문자 아스키 코드 범위 65 ~ 90
	// 소문자 아스키 코드 범위 97 ~ 122
	// public static void main(String[] args) throws Exception {
    // 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
    //     String str1 = br.readLine();
	// 	String answer = "";

	// 	for(char x : str1.toCharArray()) {
	// 		if(x >= 97 && x <= 122) answer+=(char)(x-32);
	// 		else answer+=(char)(x+32);
	// 	}
	// 	System.out.println(answer);

    // }
	
}