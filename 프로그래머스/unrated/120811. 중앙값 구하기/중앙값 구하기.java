import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        Arrays.sort(array);
        int midx = (array.length/2);
        answer = array[midx];
        
        return answer;
    }
}