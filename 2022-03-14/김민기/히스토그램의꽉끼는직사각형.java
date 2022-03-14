import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class 히스토그램의꽉끼는직사각형 {
	
	public static long[][] solution(int[] H) {
		ArrayList<Long> answerList = new ArrayList<Long>();
		ArrayList<Long> heightList = new ArrayList<Long>();
		
		for(int i=0; i<H.length; i++) {
            heightList.add((long) H[i]);
        }

		for(int i=0; i<=H.length-1;i++) {
            for(int j=i+1; j<=H.length; j++) {
                answerList.add(Collections.min(heightList.subList(i, j)));
            }
        }

        long temp = Collections.max(heightList);
        long[][] answer = new long[(int) temp][(int)2];
        
        for(int j=1; j<=Collections.max(heightList); j++){
            answer[j-1][0] = j;
            for(int i=0; i<answerList.size(); i++) {
                if(answerList.get(i) == j) {
                    answer[j-1][1]++;
                }
            }
        }
        return answer;
	}
	
	public static void main(String[] args) {
		
		int[] a = {3,2,1,1,3};
		System.out.println(Arrays.deepToString(solution(a)));
	}

}