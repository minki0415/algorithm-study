package week7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

// 아나그램(해시맵)
public class Anagram {

	//풀이 1
	public static String solution(String str1, String str2) {
		String answer = "YES";

		// HashMap 생성
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();

		// 각 str 별 HashMap 생성
		for(char x : str1.toCharArray()) {
			map1.put(x, map1.getOrDefault(x, 0)+1);
		}

		for(char x : str2.toCharArray()) {
			map2.put(x, map2.getOrDefault(x, 0)+1);
		}

		// Str1 해시맵의 key값을 기준으로 두 해시맵의 value 값이 모두 같은 지 확인 다를 경우 answer = "NO"
		for(char x : map1.keySet()){
			if(map2.get(x) != map1.get(x)) answer = "NO";
		}

		// Str2 해시맵의 key값을 기준으로 두 해시맵의 value 값이 모두 같은 지 확인 다를 경우 answer = "NO"
		for(char x : map2.keySet()){
			if(map2.get(x) != map1.get(x)) answer = "NO";
		}

		return answer;
	}

	//풀이 2
	public static String solution2(String str1, String str2) {
		String answer = "YES";

		HashMap<Character, Integer> map = new HashMap<>();

		//str1 기준으로 해시맵 생성
		for(char x : str1.toCharArray()) {
			map.put(x, map.getOrDefault(x,0) + 1);
		}
		
		// str2의 키값을 기준으로 map에 동일한 key 값이 있는지 확인
		// or, 해당 key의 value 값이 0 인 경우 ( -1 해야하는데 못하는 경우) NO 리턴
		// 이외에는 map의 value 값 -1 진행
		for(char x : str2.toCharArray()) {
			if(!map.containsKey(x) || map.get(x) == 0) return "NO";
			map.put(x, map.get(x)-1);
		}

		return answer;
	}


	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();

		System.out.println((solution2(str1, str2)));

	}
	
}