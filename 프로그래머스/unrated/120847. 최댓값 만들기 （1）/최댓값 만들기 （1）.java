class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int mxnum = 0;
        int temp = 0;
        
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                temp = numbers[i]*numbers[j];
                if(mxnum < temp) {
                    mxnum = temp;
                }
            }
        }
        answer = mxnum;
        return answer;
    }
}