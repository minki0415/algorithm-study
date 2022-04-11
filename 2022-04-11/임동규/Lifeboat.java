// Greedy - 구명보트
package level2;

import java.util.Arrays;

public class Lifeboat {
	
	public int solution(int[] people, int limit) {

		Arrays.sort(people);
		
		int len = people.length;
		int cnt = 0;
		int i = 0;
		
		while(true) {
			if(len == 1) {
				cnt++;
				break;
			}
			if(people[i] + people[i+1] > limit) {
				cnt += len - i;
				break;
			} else {
				cnt++;
				i += 2;
				if(i == len - 1) {
					cnt++;
					break;
				}
				if(i == len) {
					break;
				}
			}
		}
		
        return cnt;
    }
	
	public static void main(String[] args) {
		
		Lifeboat lb = new Lifeboat();

		System.out.println(lb.solution(new int[] {70, 80, 50}, 100));
		
	}

}
  