package week7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

// 학급회장(해시)
public class ClassPresident {

	public static char solution(int n, String str) {
		char answer = ' ';

		// HashMap 생성
		HashMap<Character, Integer> map = new HashMap<>();

		// str 에서 char 하나씩 추출하여 map에 추가 
		// 없을 경우 default 값으로 0, 있을경우 value + 1
		for(char x : str.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}

		// max 값 출력
		// key 값으로 HashMap 값 불러와서 max 보다 클 경우 대입
		// answer = key 값으로 변경 
		int max = Integer.MIN_VALUE;
		for(char x : map.keySet()) {
			if(map.get(x) > max) {
				max = map.get(x);
				answer = x;
			}
		}

		return answer;
	}


	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer n = Integer.parseInt(br.readLine());
		String str = br.readLine();

		System.out.println((solution(n, str)));

	}
	
}