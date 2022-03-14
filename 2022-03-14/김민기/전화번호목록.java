import java.util.Arrays;
import java.util.HashMap;

public class 전화번호목록 {
    
    // public static boolean solution(String[] phone_book) {
    //     boolean answer = true;
    //     HashMap<Integer, String> map = new HashMap<>();

    //     for(int i = 0; i<phone_book.length; i++) {
    //         map.put(i, phone_book[i]);
    //     }

    //     for(int i = 0; i<phone_book.length-1; i++) {
    //         for(int j = i+1; j<phone_book.length; j++){
    //             if(map.get(i).equals(phone_book[j].substring(0, map.get(i).length()))){
    //                 return false;
    //             }
    //         }
    //     }

    //     return answer;
    // }

    // public static boolean solution(String[] phone_book) {
    //     boolean answer = true;
    //     HashMap<String, Integer> map = new HashMap<>();

    //     for(int i = 0; i<phone_book.length; i++) {
    //         map.put(phone_book[i], i);
    //     }

    //     for(int i = 0; i < phone_book.length; i++) {
    //         for(int j = 0; j < phone_book[i].length(); j++){
    //             if(map.containsKey(phone_book[i].substring(0, j))) return false;
    //         }
    //     }

    //     return answer;
    // }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Arrays.sort(phone_book);

        for (int i =0; i < phone_book.length - 1; i++) {
            if(phone_book[i + 1].startsWith(phone_book[i])) return false;
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] p1 = {"119", "97674223", "1195524421"};
        String[] p2 = {"123","456","789"};
        String[] p3 = {"12","123","1235","567","88"};

        System.out.println(solution(p1));
        System.out.println(solution(p2));
        System.out.println(solution(p3));

    }
}
