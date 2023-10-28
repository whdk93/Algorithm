class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = {};
        
        int[] length_list = new int[strlist.length];
        
        for(int i=0; i<strlist.length; i++){
            length_list[i] = strlist[i].length();
        }
        
        answer = length_list;
        
        return answer;
    }
}