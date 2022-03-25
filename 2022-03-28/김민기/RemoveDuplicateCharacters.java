package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String answer = "";

		for(int i = 0; i < str.length(); i++) {
			if(str.indexOf(str.charAt(i)) == i) { // indexOf() : 해당 문자가 처음 등장하는 인덱스 값 반환
				answer += str.charAt(i);
			}
		}
		System.out.println(answer);
	}
}