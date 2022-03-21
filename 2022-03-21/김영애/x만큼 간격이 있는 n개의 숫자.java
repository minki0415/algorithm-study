class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n]; // long타입 배열 answer을 n개 담을수 있게 생성
        long num = x; // int의 범위를 넘어서는 단위가 나와 에러 발생으로 long타입 사용
        for(int i=0 ; i < answer.length ; i++) { // 그냥 n으로 하면 0번째 배열도 나오지않음
            answer[i] = num; // for문으로 answer의 길이만큼 돌면서 각자리에 num값을 넣고
            num += x; // 다음 넣을 num을 위해 x만큼 증가
        }
        return answer;
    }
}
