
//문제 : https://programmers.co.kr/learn/courses/30/lessons/42628
import java.util.ArrayList;
import java.util.Collections;

public class DoublePriorityQueue {
    public static void main(String[] args) {
        int[] answer = solution(new String[] { "I 16", "D 1" });
        for (int a : answer)
            System.out.print(a + " ");
    }

    public static int[] solution(String[] operations) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (String s : operations) {
            int len = arr.size();
            if (s.equals("D 1")) {
                if (len > 0)
                    arr.remove(len - 1);
            } else if (s.equals("D -1")) {
                if (len > 0)
                    arr.remove(0);
            } else {
                arr.add(Integer.parseInt(s.replace("I ", "")));
                Collections.sort(arr);
            }
        }

        int len = arr.size();
        if (len > 0)
            return new int[] { arr.get(len - 1), arr.get(0) };
        else
            return new int[] { 0, 0 };
    }
}
