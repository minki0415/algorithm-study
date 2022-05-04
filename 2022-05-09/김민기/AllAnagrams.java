package week8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

// 모든 아나그램 찾기
// Hash, Sliding Window
public class AllAnagrams {
    
	public static int solution(String s, String t) {

		int answer = 0;

		// t 문자열 해시맵 mapT 생성
		HashMap<Character, Integer> mapT = new HashMap<>();
		for(int i = 0; i < t.length(); i++) {
			mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1);
		}

		// s 문자열 초기 해시맵 mapT 생성
		HashMap<Character, Integer> mapS = new HashMap<>();
		for(int i = 0 ; i < t.length()-1 ; i++) {
			mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0)+1);
		}

		// rt 인덱스 해시맵에 추가
		// mapS와 mapT 가 같은 지 비교하여 같을경우 answer++
		// 비교 후 lt인덱스는 해시맵에서 삭제(0일 경우 key값 삭제), lt++
		int lt = 0;
		for(int rt = t.length()-1; rt < s.length() ; rt++) {
			mapS.put(s.charAt(rt), mapS.getOrDefault(s.charAt(rt), 0)+1);

			if(mapS.equals(mapT)) answer++;

			mapS.put(s.charAt(lt), mapS.get(s.charAt(lt))-1);
			if(mapS.get(s.charAt(lt)) == 0) mapS.remove(s.charAt(lt));
			lt++;
		}

		return answer;

	}


    public static void main(String[] args) throws IOException {
    

        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String t = br.readLine();

		br.close();

		System.out.println(solution(s, t));
        
    }

}