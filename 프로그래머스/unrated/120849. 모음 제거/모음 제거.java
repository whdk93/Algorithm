class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        //문자열을 배열로 변환
        char[] my_char = my_string.toCharArray();
        
        for(int i=0; i<my_char.length; i++) {
            if(my_char[i]=='a' || my_char[i]=='e' || my_char[i]=='i' || my_char[i]=='o' || my_char[i]=='u' ){
                continue;
            }else {
                answer += Character.toString(my_char[i]);
            }
        }
        
        return answer;
    }
}