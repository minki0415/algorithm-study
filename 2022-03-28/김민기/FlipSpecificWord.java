package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlipSpecificWord {

	// public static void main(String[] args) throws IOException {
	//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
	// 	String str = br.readLine();
	// 	char[] ch = str.toCharArray();

	// 	int left = 0, right = str.length()-1;
	// 	while(left < right){
	// 		if(Character.isLetter(ch[left]) && Character.isLetter(ch[right])){
	// 			char tmp = ch[left];
	// 			ch[left] = ch[right];
	// 			ch[right] = tmp;
	// 			left++;
	// 			right--;
	// 		} else if(!Character.isLetter(ch[left])){
	// 			left++;
	// 		} else right--;
	// 	}
	// 	System.out.println(ch);
	// }

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		String str = br.readLine();
		char[] ch = str.toCharArray();

		int left = 0, right = str.length()-1;
		while(left < right){
			if(!Character.isLetter(ch[left])) left++;
			else if(!Character.isLetter(ch[right])) right--;
			else{
				char tmp = ch[left];
				ch[left] = ch[right];
				ch[right] = tmp;
				left++;
				right--;
			}
		}
		System.out.println(ch);
	}
}