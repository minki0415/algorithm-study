import java.util.HashMap;

class Solution {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>(); // hash map 생성 
        
        // participent 명단을 map에 (이름, 참가자수) 형태로 추가
        // 동명이인을 고려 -> map.get(p) == null 이 아닐 경우 기존에 있는 이름에 hash value 값 +1
        for(String p : participant) {
        	if(map.get(p) == null) {
        		map.put(p, 1);
        	}else {
        		map.put(p,  map.get(p) + 1);
        	}
        }
        // for(String p : participant) {
        //     map.put(p, map.getOrDefault(p, 0)+1);
        // }

        // System.out.println(map); // 출력 값 : {leo=1, eden=1, kiki=1}
        
        // 완주한 사람 목록이 map에 존재하면 hash value 값에서 -1
        for(String c : completion) {
        	map.put(c,  map.get(c) - 1);
        }
        // System.out.println(map); // 출력 값 : {leo=1, eden=0, kiki=0}

        // 완주하지 못한 사람을 answer 값으로 추출
        for(String s : map.keySet()) {
        	if(map.get(s) != 0) {
        		answer += s;
        	}
        }
        return answer;
	}

    public static void main(String[] args) {
        String[] p1 = {"leo", "kiki", "eden"};
        String[] c1 = {"eden", "kiki"};
        String[] p2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] c2 = {"josipa", "filipa", "marina", "nikola"};
        String[] p3 = {"mislav", "stanko", "mislav", "ana"};
        String[] c3 = {"stanko", "ana", "mislav"};
        
        System.out.println(solution(p1,c1));
        System.out.println(solution(p2,c2));
        System.out.println(solution(p3,c3));
    };

}