package level2;

import java.util.PriorityQueue;

public class MoreSpicy {
	public static int solution(int[] scoville, int K) {
		PriorityQueue<Integer> que = new PriorityQueue<Integer>();
		for (int x : scoville) {
			que.offer(x);
		}

		int cnt = 0;
		while (que.size()!=1) {
			if (que.peek() >= K) {
				return cnt;
			} else {
				int fst = que.poll();
				int snd = que.poll();
				que.offer(fst + snd * 2);
				cnt++;
			}
		}
		
		if(que.poll()>=K) {
			return cnt;
		} else {	
			return -1;
		}
	}

	public static void main(String[] args) {
		int[] a = {3,9,1,2,10,12};
		System.out.println(solution(a,7));
	}

}
