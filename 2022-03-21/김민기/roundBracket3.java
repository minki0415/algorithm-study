// https://programmers.co.kr/learn/courses/30/lessons/60058#qna
// https://fbtmdwhd33.tistory.com/250

public class roundBracket3 {

    public static boolean isCorrect(String str) {
        int count = 0;

        if(str.charAt(0)==')') return false; //첫 문자가 ')' 인 경우에는 올바른 괄호 문자열이 아니므로 false 반환
        for(int i = 0; i<str.length(); i++) { // 문자열 탐색하여 '(' 일경우 count++, 아닐경우 count--
            if(str.charAt(i) == '(') count++;
            else {
                count--;
                if(count < 0) return false; // count가 음수가 될 경우 = ')'의 개수가 더 많아지는 경우 올바른 문자열이 아니므로 false 반환 
            }
        }
        return true;
    }

    public static String split(String w) {

        StringBuilder u = new StringBuilder();
        StringBuilder v = new StringBuilder();

        if(w.length() == 0) return "";
        
        int count = 0;

        for(int i = 0; i < w.length(); i++) {
            if(w.charAt(i) == '(') count++;
            else count--;

            if(count == 0) {
                u.append(w.substring(0, i+1));
                v.append(w.substring(i+1));
                if(isCorrect(u.toString())){
                    u.append(split(v.toString()));
                }else {
                    StringBuilder str = new StringBuilder();
                    str.append("(");
                    str.append(split(v.toString()));
                    str.append(")");
                    str.append(reverse(u.toString()));
                    return str.toString();
                }
                break;
            }
        }
        return u.toString();
    }

    public static String reverse(String str) {
        StringBuilder s = new StringBuilder();

        for(int i = 1; i < str.length()-1 ; i++) {
            if(str.charAt(i) =='(') s.append(")");
            else s.append("(");
        }
        return s.toString();
    }
    
    public static String solution(String p) {
        String answer;

        if(isCorrect(p)) return p;
        answer = split(p);

        return answer;
    }



    public static void main(String[] args) {
        System.out.println(solution(")(()"));
    }
}