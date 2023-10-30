class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=my_string.length(); i>0; i--) {
            if(i == my_string.length()) {
                answer+=my_string.substring(i-1);
            }else{
                answer+=my_string.substring(i-1, i);
            }
        }
        
        return answer;
    }
}