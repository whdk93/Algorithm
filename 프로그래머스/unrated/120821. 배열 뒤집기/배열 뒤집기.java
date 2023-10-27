class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int[] cnt = new int[num_list.length];
        
        for(int i=0; i<num_list.length; i++) {
            cnt[i] = num_list[num_list.length-i-1];
        }
        answer = cnt;
        
        return answer;
    }
}