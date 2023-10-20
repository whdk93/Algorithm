class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
            if(num1 < 0 || num1 > 10000) {
                System.out.println("다시입력: 범위오류");
            }else if(num2 < 0 || num2 > 10000) {
                System.out.println("다시입력: 범위오류");
            }else{
                if(num1 == num2){
                    answer = 1;
                }else if(num1 != num2){
                    answer = -1;
                }
            }
        
        return answer;
    }
}