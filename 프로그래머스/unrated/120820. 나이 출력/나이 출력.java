class Solution {
    public int solution(int age) {
        int answer = 0;
        
        //제한사항
        if(age < 0 || age > 120) {
            System.out.println("다시입력:범위오류");
        }else {
            answer = 2022 - age + 1 ; 
        }
        return answer;
    }
}