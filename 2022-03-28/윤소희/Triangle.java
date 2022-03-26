/**
 * Triangle
 */
public class Triangle {

    public static void main(String[] args) {
        System.out.println(solution(new int[][] { { 7 }, { 3, 8 }, { 8, 1, 0 }, { 2, 7, 4, 4 }, { 4, 5, 2, 6, 5 } }));
    }

    public static int solution(int[][] triangle) {
        int answer = 0;

        for (int i = 1; i < triangle.length; i++) {
            triangle[i][0] += triangle[i - 1][0];

            for (int j = 1; j < triangle[i].length - 1; j++) {
                triangle[i][j] += Math.max(triangle[i - 1][j - 1], triangle[i - 1][j]);
            }
            triangle[i][i] += triangle[i - 1][triangle[i - 1].length - 1];
        }

        for (int a : triangle[triangle.length - 1]) {
            answer = answer < a ? a : answer;
        }

        return answer;
    }
}