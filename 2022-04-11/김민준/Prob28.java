package week2;

/*
    Week2.Prob28 : 체육복
    https://programmers.co.kr/learn/courses/30/lessons/42862

    Refactoring : n 크기의 flag 배열을 만들어서 lost를 인덱스로 하는 값은 --, reserve를 인덱스로 하는 값은 ++ 로 하면 수월하게 가능
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Prob28 {

    public static void solution(int n, int[] lost, int[] reserve){
        int answer = 0;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        ArrayList<Integer> lost_list = new ArrayList<>();
        ArrayList<Integer> reserve_list = new ArrayList<>();

        for(int data : reserve){
            reserve_list.add(data);
        }

        //여벌 체육복을 가져온 학생이 체육복을 도난당했을 때는 list에 추가하지 않음
        for(int data : lost){
            if(reserve_list.contains(data)){
                reserve_list.remove(reserve_list.indexOf(data));
            } else {
                lost_list.add(data);
            }
        }

        answer = n - lost_list.size();
        for(int i=0; i<lost_list.size(); i++){
            for(int j=0; j<reserve_list.size(); j++){
                if( (lost_list.get(i) + 1 == reserve_list.get(j) ) || (lost_list.get(i) - 1 == reserve_list.get(j))) {
                    reserve_list.remove(j);
                    answer++;
                    break;
                }
            }
        }

        System.out.println(answer);

    }

    public static void main(String[] args) {
        int n1 = 5;
        int[] lost1 = new int[] {2, 4};
        int[] reserve1 = new int[] {1, 3, 5};

        int n2 = 5;
        int[] lost2 = new int[] {2, 4};
        int[] reserve2 = new int[] {3};

        int n3 = 3;
        int[] lost3 = new int[] {3};
        int[] reserve3 = new int[] {1};

        solution(n1, lost1, reserve1);
        solution(n2, lost2, reserve2);
        solution(n3, lost3, reserve3);
    }
}