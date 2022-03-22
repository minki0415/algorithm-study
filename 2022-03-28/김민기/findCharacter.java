package week2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class findCharacter {

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toLowerCase();
	char c = br.readLine().toLowerCase().charAt(0);

	int count = 0;

	// for(int i = 0; i < str1.length(); i++){
	// 	if(str1.charAt(i) == c) count++;
	// }

	for(char x : str.toCharArray()){
		if(x == c) count++;
	}
	System.out.println(count);
    }	
}
