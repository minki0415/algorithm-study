package week3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersOnly {

	// public static void main(String[] args) throws IOException {
	// 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //     char[] charList = br.readLine().toCharArray();

	// 	String temp = "";

	// 	for(char x : charList) {
	// 		if(Character.isDigit(x)) {
	// 			temp += x;
	// 		}
	// 	}
		
	// 	int answer = Integer.parseInt(temp);
	// 	System.out.println(answer);

	// }
	// public static void main(String[] args) throws IOException {
	// 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //     char[] charList = br.readLine().toCharArray();

	// 	String temp = "";

	// 	for(char x : charList) {
	// 		if(Character.isDigit(x)) {
	// 			temp += x;
	// 		}
	// 	}
		
	// 	int answer = Integer.valueOf(temp);
	// 	System.out.println(answer);

	// }

	// public static void main(String[] args) throws IOException {
	// 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //     String str = br.readLine().replaceAll("[^\\d]", "");
	// 	int answer = Integer.parseInt(str);
	// 	System.out.println(answer);
	// }
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
		int answer = 0;
		
		for(char x : str.toCharArray()) {
			if(x>=48 && x<=57) answer = answer*10+(x-48);
		}
	}

}