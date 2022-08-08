
public class Carpet {

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for(int i = 1; i <= Math.sqrt(yellow); i++) {
            if(yellow % i == 0) {
                int h = i + 2;
                int w = yellow / i + 2;
                
                if(h * w - yellow == brown) {
                    answer[0] = w;
                    answer[1] = h;
                }  
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        int b  = 24;
        int y = 24;

        for(int i : solution(b, y)) {
            System.out.println(i);
        }
        
    }

}
