package week7;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//태권왕
public class TaekwonKing {


	public static String solution(int[][] arr) {

		//정답을 담을 String Builder 생성
		StringBuilder sb = new StringBuilder();
		
		// 배열의 길이만큼 for문 진행
		for(int i = 0 ; i < arr.length ; i++) {
			
			// 큐 생성
			Queue<Integer[]> queue = new LinkedList<>();
			// 큐에 S, T, Count 값 추가
			queue.offer(new Integer[] {arr[i][0], arr[i][1], 0});

			while(!queue.isEmpty()) {
				Integer[] score = queue.poll();
				int score1 = score[0];
				int score2 = score[1];
				int count = score[2];
				
				// score1과 score2가 같다면 정답에 추가, break
				if(score1 == score2) {
					sb.append(count + "\n");
					break;
				}
				
				// score1이 score 2보다 커질 경우 
				if(score1 > score2) continue;
	
				queue.offer(new Integer[] {score1 * 2, score2 +3, count+1});
				queue.offer(new Integer[] {score1 + 1, score2, count+1});
			}
		}

		return sb.toString();
	}


	public static void main(String[] args) throws IOException {
		
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();

		int[][] arr = new int[n][2];
		for(int i = 0 ; i < n ; i ++) {
			for(int j = 0 ; j < 2 ; j++) {
				arr[i][j] = kb.nextInt();
			}
		}

		System.out.println(solution(arr));

		kb.close();

	}
	
}