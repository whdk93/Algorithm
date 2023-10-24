import java.lang.Math;

class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        if(num1 < 0 || num1 > 100) {
            System.out.println("range error");
        }else if(num2 < 0 || num2 > 100) {
            System.out.println("range error");
        }else {
            answer = (int)((double)num1/(double)num2*1000);
        }
        
        return answer;
    }
}