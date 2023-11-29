class Solution {
    public static int isInteger(double num) {
        int inum = 0;
        if(num % 1 == 0.0) {
            inum = (int) num;
            return inum;
        }else {
            return -1;
        }
    } 
    
    public long solution(long n) {
        long answer = 0;
        double num = 0;
        
        num = Math.sqrt(n);
        
        answer = isInteger(num);
        
        if(answer != -1) {
            answer = (long) Math.pow((answer+1),2);
        }
        
        
        return answer;
    }
}