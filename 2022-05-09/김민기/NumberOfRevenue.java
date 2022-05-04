package week8;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// 매출액의 종류
// Hash, Sliding Window
public class NumberOfRevenue {
    
	public static void solution(int n, int k, int[] arr) {

		// 전체 매출액 개수 : n = 7
		// 계산해야할 연속 일수 : k = 4
		// 매출액 : arr = {20, 12, 20, 10, 23, 17, 10}

		// 매출액을 담을 해시 맵 생성
		HashMap<Integer, Integer> rev = new HashMap<>();
		
		//초기 연속된 4일 동안의 매출액 해시 맵 생성
		for(int i = 0 ; i < k ; i++) {
			rev.put(arr[i], rev.getOrDefault(arr[i], 0) + 1);
		}

		// 맨 처음 4일 간 매출의 종류 출력
		System.out.print(rev.size() + " ");
		
		// 하루씩 이동하면서 연속된 매출 해시맵 생성
		// 첫날의 매출액 -1 and 5번째 날 매출 +1
		// 해시맵의 value 값이 0인 경우 삭제
		for(int i = 0 ; i < n-k ; i++) {

			if(rev.get(arr[i]) > 1) rev.put(arr[i], rev.get(arr[i])-1);
			else rev.remove(arr[i]);
			rev.put(arr[i+k], rev.getOrDefault(arr[i+k], 0) + 1);

			// 하루 이동할 때 마다 해시맵의 사이즈 출력
			System.out.print(rev.size() + " ");
			
		}

	}

	public static ArrayList<Integer> solution2(int n, int k, int[] arr) {

		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> HM = new HashMap<>();

		for(int i = 0 ; i < k-1 ; i++) {
			HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
		}

		int lt = 0;
		for(int rt = k-1; rt < n ; rt++) {
			HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1);
			answer.add(HM.size());
			HM.put(arr[lt], HM.get(arr[lt])-1);
			if(HM.get(arr[lt]) == 0) HM.remove(arr[lt]);
			lt++;
		}

		return answer;

	}

	public static void solution3(int n, int k, int[] arr) {

		for(int i = 0 ; i <= n-k ; i++) {
			HashMap<Integer, Integer> rev = new HashMap<>();

			for(int j = 0 ; j < k ; j++) {
				rev.put(arr[i+j], rev.getOrDefault(arr[i+j], 0)+1);
			}
			System.out.print(rev.size() + " ");
		}

	}

    public static void main(String[] args) throws IOException {
    

        Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int k = kb.nextInt();

		int [] arr = new int[n];
		for(int i = 0 ; i < n ; i ++) {
			arr[i] = kb.nextInt();
		}

		solution(n, k, arr);
		for(int x : solution2(n, k, arr)) System.out.print(x+" ");

		kb.close();
        
    }

}