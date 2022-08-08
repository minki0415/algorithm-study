import java.util.HashMap;

public class q1 {
    public static String solution(String code, String message){
        
        String ans = "";
        HashMap<String, String> map = new HashMap<>();
        
        for(int i = 0; i < code.length(); i++) {
            if(i < 9) {
                map.put(String.valueOf(code.charAt(i)), "0" + (i+1));
                map.put("0" + (i+1), String.valueOf(code.charAt(i)));
            } else {
                map.put(String.valueOf(code.charAt(i)), "" + (i+1));
                map.put( "" + (i+1), String.valueOf(code.charAt(i)));
 
            }
        }

        if(message.charAt(0) >= 'a' &&  message.charAt(0) <= 'z') {
            for(int i = 0; i < message.length(); i++) {
                ans += map.get(String.valueOf(message.charAt(i)));
            }
        }

        if(message.charAt(0) >= '0' &&  message.charAt(0) <= '9') {
            for(int i = 0; i < message.length() - 1; i += 2) {
                String tmp = message.substring(i, i+2);
                ans += map.get(tmp);
            }
        }

        return ans;

    }

    public static void main(String[] args) {
       
        String code = "abcdefghijklmnopqrstuvwxyz";
        String message = "20051920";

        System.out.println(solution(code, message));

    }
}
