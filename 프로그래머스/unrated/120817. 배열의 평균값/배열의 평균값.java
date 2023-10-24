class Solution {
    public static boolean isNumber(int[] nums) {
        //길이 제한
        if(nums.length < 1 || nums.length > 100) {
            return false;
        }
        // 원소 제한
        for(int i=0; i < nums.length; i++) {
            if(nums[i] < 0 || nums[i] > 1000) {
                return false;
            }
        }
        return true;
    }
    
    public double solution(int[] numbers) {
        double answer = 0;
        
        if(isNumber(numbers)) {
            int sum = 0;
            for(int i=0; i<numbers.length; i++) {
                sum+=numbers[i];
            }
            answer = (double)sum/(double)numbers.length;
        }
        
        return answer;
    }
}