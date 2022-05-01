package week7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// 프로그래머스, K번째 수
public class KthNumber {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }

    public static int[] solution2(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i<commands.length; i++){
            ArrayList<Integer> ansList = new ArrayList<Integer>();
            int startIndex = commands[i][0]-1;
            int endIndex = commands[i][1]-1;
            int ansIndex = commands[i][2]-1;

            for(int j = startIndex; j<=endIndex; j++) {
                ansList.add(array[j]);
                Collections.sort(ansList);
            }

            answer[i]= ansList.get(ansIndex);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};
        System.out.println(Arrays.toString(solution(arr, commands)));
        System.out.println(Arrays.toString(solution2(arr, commands)));

    }
}