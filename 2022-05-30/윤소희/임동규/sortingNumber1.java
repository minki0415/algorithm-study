package baekjoon.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class sortingNumber1 {
    
    static int[] arr;

    // 선택 정렬
    public static void selectionSort(int n) {

        // 정렬
        for(int i = 0; i < n-1; i++) {
            for(int j = i+1; j < n; j++) {
                int tmp = 0;
                if(arr[i] > arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }

    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];

        // 배열에 입력값 저장
        // for(int i = 0; i < n; i++) {
        //     arr[i] = Integer.parseInt(br.readLine());
        // }

        // 1. Array.sort() API 사용
        // Arrays.sort(arr);

        // 2. 선택정렬 메소드 호출
        // selectionSort(n);

        // 출력
        // for(int i : arr) {
        //     sb.append(i).append('\n');
        // }

        // --------------------------------------------

        // 3. 카운팅 정렬 (입력하는 정수가 중복이 아니므로 사용 가능)
        boolean[] check = new boolean[2001];

        for(int i = 0; i < n; i++) {
            check[Integer.parseInt(br.readLine()) + 1000] = true;
        }

        for(int i = 0; i < 2001; i++) {
            if(check[i]) {  // check[i] == true
                sb.append(i - 1000).append('\n');
            }
        }
        
        System.out.println(sb);

        br.close();
        
    }

}
