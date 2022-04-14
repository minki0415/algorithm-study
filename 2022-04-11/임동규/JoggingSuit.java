// Greedy - ü����
package level1;

import java.util.Arrays;

public class JoggingSuit {

	public static int solution(int n, int[] lost, int[] reserve) {	
		// ���� ��Ű��
		Arrays.sort(lost);
		Arrays.sort(reserve);
		
		// �н� �� ���� �迭�� ������ ���ڰ� ����ִ� ��� ���� 0���� ����
		// (�迭�� ���� ���)
		for(int i = 0; i < lost.length; i++) {
			for(int j = 0; j < reserve.length; j++) {
				if(lost[i] < reserve[j]) {
					break;
				}
				if(lost[i] == reserve[j]) {
					lost[i] = 0;
					reserve[j] = 0;
					break;
				}
			}
		}
		
		for (int i = 0; i < lost.length; i++) {
			// 0�� ���� ���̹Ƿ� continue
			if(lost[i] == 0) {
				continue;
			}
			int low = lost[i] - 1;
			int high = lost[i] + 1;

			for (int j = 0; j < reserve.length; j++) {
				// 0�� ���� ���̹Ƿ� continue
				if (reserve[j] == 0) {
					continue;
				}
				if (reserve[j] == low) {
					reserve[j] = 0;
					lost[i] = 0;
					break;
				} else if (reserve[j] == high) {
					reserve[j] = 0;
					lost[i] = 0;
					break;
				} else {
					continue;
				}
			}
		}

		int cnt = 0;
		for (int i = 0; i < lost.length; i++) {
			if (lost[i] != 0) {
				cnt++;
			}
		}

		return n - cnt;
	}

	public static void main(String[] args) {
		int n = 5;
		int[] lost = {1, 2, 4};
		int[] reserve = {2, 3, 4, 5};
		
		System.out.println(solution(n, lost, reserve));

	}
}
