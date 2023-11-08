class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String number = "";
        number = Integer.toString(n);
        
        int num = 0;
        
        int sum = 0;
        for(int i=0; i<number.length(); i++) {
            if(i == number.length()-1) {
                num = Integer.parseInt(number.substring(i));
            }else {
                num = Integer.parseInt(number.substring(i, i+1));
            }
                
            sum += num;
        }
        
        answer = sum;
        
        return answer;
    }
}