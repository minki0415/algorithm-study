package codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ÇØ½Ì
public class Hashing {
	
	public static long solution(int len, String str) {
		int m = 1234567891;
		long hashValue = 0;
		long r = 1;
		
		for(int i = 0; i < len; i++) {
			hashValue += ( ((str.charAt(i) - 96) % m) * r ) % m;
			r = r * 31 % m;
		}
		
		hashValue = hashValue % m;
		
		return hashValue;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int len = Integer.parseInt(in.readLine());;
		String str = in.readLine();
		
		in.close();
		
		System.out.println(solution(len, str));
		
		
	}

}
