class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num1 < -50000 || num1 > 50000) {
            System.out.println("다시입력:범위오류");
        }else if(num2 < -50000 || num2 > 50000) {
            System.out.println("다시입력:범위오류");
        }else {
            answer = num1-num2;
        }
        return answer;
    }
}