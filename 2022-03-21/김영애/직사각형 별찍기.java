import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 화면에서 키보드로 값 입력 가능한 Scanner 클래스
        int a = sc.nextInt(); // 입력받은 값을 int타입으로 반환
        int b = sc.nextInt();
        
				// int[][] c = new int[행의수][열의수];
        for(int i = 0; i < b; i++){ // 행
            for(int j = 0; j < a; j ++){ // 열
                System.out.print("*"); // 다음줄로 넘어가지 않게 print()로 사용 
            }
            System.out.println(); // 다음줄로 넘어가기 위해 println()로 사용
        }
    }
}
