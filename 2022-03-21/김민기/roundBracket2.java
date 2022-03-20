public class roundBracket2 {

    public static String solution(String p) {
        return splitString(p);
    }

    //u, v split 함수
    public static String splitString(String w) {
        if (w.equals("")) {
            return "";
        }
        String u = w.substring(0, B_check(w)), v = w.substring(B_check(w), w.length());

        return (check(u)) ? u + splitString(v) : '(' + splitString(v) + ')' + change(u);
    }


    public static Boolean check(String str) {
        int ch = 0;

        for (int i = 0; i < str.length(); i++) {
            ch += (str.charAt(i) == '(') ? 1 : -1;
            if(ch < 0){ return false; }
        }

        if (ch != 0){ return false; }

        return true;
    }


    public static int B_check(String str) {
        int ch = 0;
        for (int i = 0; i < str.length(); i++) {
            ch += (str.charAt(i) == '(') ? 1 : -1;
            if (ch == 0) { return i+1; }
        }
        return 0;
    }


    public static String change(String str) {
        String s = "";
        for (int i = 1; i < str.length() - 1; i++) {
            s += (str.charAt(i) == '(') ? ')' : '(';
        }
        return s;
    }


    public static void main(String[] args) {
        System.out.println(solution(")(()"));
    }
}