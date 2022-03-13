package level1;

import java.util.HashMap;

// 완주하지 못한 선수
public class Player {
	
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i = 0; i < participant.length; i++) {
        	map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }
        for(int i = 0; i < completion.length; i++) {
        	map.put(completion[i], map.get(completion[i]) - 1);
        }
        for(int i = 0; i < participant.length; i++) {
        	if(map.get(participant[i]) != 0) {
        		answer = participant[i];
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		String[] p = {"leo", "kiki", "eden"};
		String[] c = {"eden", "kiki"};

		System.out.println(solution(p, c));
		
	}

}
