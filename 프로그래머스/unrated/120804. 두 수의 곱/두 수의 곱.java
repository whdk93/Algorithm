class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        //제한사항
        if(num1 < 0 || num1 >100){
            System.out.println("지정된 범위를 벗어났습니다. 올바른 값을 입력하세요.");
        }else if (num2 < 0 || num2 >100){
            System.out.println("지정된 범위를 벗어났습니다. 올바른 값을 입력하세요.");
        }else{
            answer = num1 * num2; 
        }
        return answer;
    }
}