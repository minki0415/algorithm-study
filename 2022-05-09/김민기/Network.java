package week8;
import java.io.IOException;

// 프로그래머스 = 네트워크
// DFS
// https://beaniejoy.tistory.com/41
// https://velog.io/@ajufresh/프로그래머스-네트워크-문제풀이-Java
public class Network {
	
	public static int solution(int n, int[][] computers) {
		int answer = 0;
		boolean[] visited = new boolean[n];

		for(int i = 0 ; i < n ; i++) {
			if(!visited[i]) {
				dfs(computers, i, visited);
				answer++;
			}
		}

        return answer;
    }

	static boolean[] dfs(int[][] computers, int i, boolean[] visited) {
		visited[i] = true;

		for(int j = 0 ; j < computers.length; j++) {
			if(i != j && computers[i][j] == 1 && visited[j] == false) {
				visited = dfs(computers, j, visited);
			}
		}
		return visited;
	}

	public static void main(String[] args) throws IOException {
		
		int n = 3;
		int[][] computers = {{1,1,0},{1,1,0},{0,0,1}};

		System.out.println(solution(n, computers));

        
    }
}