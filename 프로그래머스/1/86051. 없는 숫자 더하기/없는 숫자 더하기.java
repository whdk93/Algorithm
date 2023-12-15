class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int sum = 0;
        int minus_sum = 0;
        
        
        for(int i = 0; i<10; i++) {
            for(int j=0; j<numbers.length; j++) {
                if(numbers[j] == i) {
                    sum += i;
                }
                    
            }
        }
        
        answer = 45-sum;
        
        return answer;
    }
}