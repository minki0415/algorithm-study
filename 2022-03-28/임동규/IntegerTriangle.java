package level3;

public class IntegerTriangle {
	public static int solution(int[][] triangle) {
		int answer = 0;
		
		int len = triangle.length;
				
		for(int i = 1; i < len; i++) {
			for(int j = 0; j < i + 1; j++) {
				if(j == 0) {
					triangle[i][j] = triangle[i-1][0] + triangle[i][j];
				} else if(j == i) {
					triangle[i][j] = triangle[i-1][j-1] + triangle[i][j];
				} else {
					triangle[i][j] = Math.max(triangle[i-1][j-1], triangle[i-1][j]) + triangle[i][j];
				}
			}
		}
		
		for(int i = 0; i < len; i++) {
			if(answer < triangle[len - 1][i]) {
				answer = triangle[len-1][i];
			}
		}
		
		return answer;
	}
	
	// Àç±Í??
	
	public static void main(String[] args) {
		int[][] triangle = {
				{7},
				{3,8},
				{8,1,0},
				{2,7,4,4},
				{4,5,2,6,5}
		};
		
		System.out.println(solution(triangle));
	}

}
