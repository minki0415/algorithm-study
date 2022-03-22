package week2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class findCharacter {

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine().toLowerCase();
		String str2 = br.readLine().toLowerCase();

		int count = 0;

		for(int i = 0; i < str1.length(); i++){
			if(str1.charAt(i) == str2.charAt(0)) count++;
		}

		System.out.println(count);
    }	
}
