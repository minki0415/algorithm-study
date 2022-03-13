package level2;

import java.util.HashMap;

// 전화번호목록
public class PhoneBook {
	public static boolean solution(String[] phone_book) {
        boolean answer = true;
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i = 0; i < phone_book.length; i++) {
        	map.put(phone_book[i], phone_book[i].length());
        }
        
        for(int i = 0; i < phone_book.length; i++) {
        	for(int j = 0; j < map.get(phone_book[i]) - 1; j++) {
        		if(map.containsKey(phone_book[i].substring(0, j+1))) {
        			answer = false;
        		}
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		String[] phoneNum = {"119", "97674223", "1195524421"};
		System.out.println(solution(phoneNum));		
		
	}

}
