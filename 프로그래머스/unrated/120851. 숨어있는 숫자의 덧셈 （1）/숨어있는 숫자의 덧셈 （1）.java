class Solution {
    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        }
        catch(NumberFormatException e) {
            return false;
        }
    }
    
    public int solution(String my_string) {
        int answer = 0;
        
        String[] str_list = my_string.split("");
        
        for(int i = 0; i<str_list.length; i++) {
            if(isNumeric(str_list[i])) {
                answer += Integer.parseInt(str_list[i]);
            }
        }
        
        return answer;
    }
}