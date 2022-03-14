package week1;

import java.util.ArrayList;
import java.util.Arrays;

public class HateSameNum {
	public static int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<Integer>(); // ArrayList 선언

        int num = -1; // 처음 비교 대상은 제한사항에 존재하지 않은 -1로 설정
        for(int i=0; i<arr.length; i++){
            if(arr[i] != num){
                list.add(arr[i]); // ArrayList에 중복되지 않는 값 담기
                num = arr[i];
            } // 중복되지 않는 값은 ArrayList에 담지 않고 넘어감
        }

        int[] answer = new int[list.size()]; // list에 담은 크기만큼의 크기로 배열선언
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] eg1 = {1,1,3,3,0,1,1};
        int[] eg2 = {4,4,4,3,3};
        System.out.println(Arrays.toString(solution(eg1)));
        System.out.println(Arrays.toString(solution(eg2)));
    }
}
