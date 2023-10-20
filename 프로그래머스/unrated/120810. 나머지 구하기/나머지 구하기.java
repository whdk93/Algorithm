class Solution {
    public int solution(int num1, int num2) {
        int answer = -1;
        
        if(num1 < 0 || num1 > 100) {
            System.out.println("다시 입력: 범위 오류");
        }else if(num2 < 0 || num2 > 100){
            System.out.println("다시 입력: 범위 오류");
        }else{
            answer = num1%num2;
        }
        return answer;
    }
}