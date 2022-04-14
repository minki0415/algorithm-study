package codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MicrowaveOven {
	
	public static void solution(int t) {
		
		if(t % 10 != 0) {
			System.out.println(-1);
		} else {
			int btnA = 300;
			int btnB = 60;
			int btnC = 10;
			
			int cntA = 0;
			int cntB = 0;
			int cntC = 0;
			
			while(t != 0) {
				if(t >= btnA) {
					cntA =  t / btnA;
					t %= btnA;
				} else if(t >= btnB) {
					cntB = t / btnB;
					t %= btnB;
				} else {
					cntC = t / btnC;
					t %= btnC;
				}
				
			}
			
			System.out.println(cntA + " " + cntB + " " + cntC);
		}
				
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		solution(t);
	}

}
