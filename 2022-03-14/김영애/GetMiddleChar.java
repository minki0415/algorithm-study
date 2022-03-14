package week1;

public class GetMiddleChar {
    public static String solution(String s) {
        int ans = s.length();
          if (ans % 2 == 1){
           return Character.toString(s.charAt(ans/2));   
          }
          else{
              return s.substring(ans/2-1, ans/2+1);
          }
        }
    
    public static void main(String[] args) {
        System.out.println(solution("abcde"));
        System.out.println(solution("qwer"));
    }
}
