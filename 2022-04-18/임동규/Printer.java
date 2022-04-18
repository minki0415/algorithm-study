// Ω∫≈√/≈•

package level2;

import java.util.Collections;
import java.util.PriorityQueue;

public class Printer {
	
	public static int solution(int[] priorities, int location) {
		PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i : priorities) {
			que.offer(i);
		}
		
		int order = 0;
		while(que.size() != 0) {
			for(int i = 0; i < priorities.length; i++) {
				if(priorities[i] == que.peek()) {
					if(i == location) {
						order++;
						return order;
					} else {
						order++;
						que.poll();
					}
				} else {
					continue;
				}
			}
		}
		
		return -1;
		
    }
	
	public static void main(String[] args) {
		
		int[] p = {2,1,3,2};
		int l = 3;
		
		System.out.println(solution(p,l));
	}

}
