package week2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WordInJava {

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

		String[] words = str.split(" ");
		// System.out.println(Arrays.toString(words));

		String answer = "";
		for(int i = 0; i < words.length; i++) {
			if(answer.length() < words[i].length()) answer = words[i]; 
		}

		System.out.println(answer);
    }
	
    // public static void main(String[] args) throws Exception {
    // 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     String str = br.readLine();

	// 	String answer = "";
	// 	int m = Integer.MIN_VALUE;
	// 	String[] s = str.split(" ");
	// 	for(String x : s) {
	// 		int len = x.length();
	// 		if(len > m) {
	// 			m = len;
	// 			answer = x;
	// 		}
	// 	}
	// 	System.out.println(answer);
    // }

	// public static void main(String[] args) throws Exception {
	// 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// 	String str = br.readLine();
		
	// 	String answer = "";
	// 	int m = Integer.MIN_VALUE, pos;
	// 	while((pos = str.indexOf(' ')) != -1){
	// 		String tmp = str.substring(0, pos);
	// 		int len = tmp.length();
	// 		if(len > m) {
	// 			m = len;
	// 			answer = tmp;
	// 		}
	// 		str = str.substring(pos + 1);
	// 	}
	// 	if(str.length()>m) answer = str;
	// 	System.out.println(answer);
	// }
}
