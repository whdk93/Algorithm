class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int max_line = 0;
        int max_idx = 0;
        int sum = 0;
        
        for(int i=0; i<sides.length; i++) {
            if(sides[i] > max_line) {
                max_line = sides[i];
                max_idx = i;
            }
        }
        
        for(int i=0; i<3; i++) {
            if(i != max_idx) {
                sum+=sides[i];
            }
        }
        if(sum > max_line) {
            answer = 1;
        }else if(sum <= max_line) {
            answer = 2;
        }
        
        return answer;
    }
}