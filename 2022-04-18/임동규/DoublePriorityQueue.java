// 힙(Heap)
package level3;

import java.util.Collections;
import java.util.PriorityQueue;

//class QueueInstance {
//	
//	private static QueueInstance instance = new QueueInstance();
//	private PriorityQueue<Integer> que = new PriorityQueue<Integer>();
//	private PriorityQueue<Integer> reverseQue = new PriorityQueue<>(Collections.reverseOrder());
//	
//	private QueueInstance() {}
//	
//	public static QueueInstance getInstance() {
//		return instance;
//	}
//	
//	public PriorityQueue<Integer> getQue() {
//		return que;
//	}
//	
//	public PriorityQueue<Integer> getReverseQue() {	
//		return reverseQue;
//	}
//	
//}


public class DoublePriorityQueue {
	
	public static PriorityQueue<Integer> deleteMin(PriorityQueue<Integer> q) {
		if(q.size() == 0) {
			return q;
		}
		
		PriorityQueue<Integer> que = new PriorityQueue<>();
		
		for(int x : q) {
			que.offer(x);
		}
		
		que.poll();
		
		return que;
	}
	
	public static PriorityQueue<Integer> deleteMax(PriorityQueue<Integer> q) {
		if(q.size() == 0) {
			return q;
		}
		
		PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int x : q) {
			que.offer(x);
		}
		
		que.poll();
		
		return que;
	}
	
	public static int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> que = new PriorityQueue<>();
        String[] arr = new String[2];

        for(int i = 0; i < operations.length; i++) {
        	arr = operations[i].split(" ");
        	if(arr[0].equals("I")) {
        		que.offer(Integer.parseInt(arr[1]));
        	} else if(arr[0].equals("D") ){
        		if(arr[1].equals("1")) {
        			// 최대값 삭제
        			que = deleteMax(que);
        		} else {
        			// 최소값 삭제
        			que = deleteMin(que);
        		}
        	}
        }
        
        if(que.size() == 0) {
        	answer[0] = 0;
        	answer[1] = 0;
        } else {
        	int[] tmp = new int[que.size()];
        	
        	for(int i = 0; i < tmp.length; i++) {
        		tmp[i] = que.poll();
        	}
        	
        	answer[0] = tmp[tmp.length - 1];
        	answer[1] = tmp[0];
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		String[] operations = {"I 16","D 1"};
	
		for(int x : solution(operations)) {
			System.out.println(x);
		}
	}

}
