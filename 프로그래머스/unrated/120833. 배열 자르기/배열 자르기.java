class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        
        int[] newnums = new int[num2-num1+1];
        
        for(int i=0; i<newnums.length; i++) {
            newnums[i] = numbers[num1+i];
        }
        
        answer = newnums;
        
        return answer;
    }
}