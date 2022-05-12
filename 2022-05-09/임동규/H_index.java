import java.util.Arrays;

public class H_index {

    public static int solution(int[] citations) { 
        int len = citations.length;
        Arrays.sort(citations);
        int max = 0;

        for(int h = 0; h <= len; h++) {
            int cnt = 0;
            for(int j = 0; j < len; j++) {
                if(citations[j] < h) {
                    continue;
                } else {
                    cnt = len - j;
                    break;
                }
            }
            
            if(cnt < h) {
                break;
            } else {
                max = h;
            }
        }

        return max;
    }

    public static int solution2(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        
        int h = 0;
        for(int i = 0; i < citations.length; i++) {
            h = citations.length - i;
            
            if(citations[i] >= h) {
                answer = h;
                break;        
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] citations = {3,0,6,1,5};
        System.out.println(solution2(citations));
    }
}
