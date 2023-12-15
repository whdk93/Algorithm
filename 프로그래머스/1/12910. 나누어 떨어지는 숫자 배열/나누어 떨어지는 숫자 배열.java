class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int cnt = 0;
        int cnt2 = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor == 0) {
                cnt++;
            }
        }
        
        int[] num_arr = {};
        
        if(cnt != 0) {
            num_arr = new int[cnt];
            for(int i=0; i<arr.length; i++) {
                if(arr[i]%divisor == 0) {
                    num_arr[cnt2] = arr[i];
                    cnt2++;
                }
            }
        }else if(cnt == 0){
            num_arr = new int[]{-1};
        }
        
        int temp = 0;
        for(int i = 0; i<num_arr.length; i++) {
            for(int j = i+1; j<num_arr.length; j++) {
                if(num_arr[i] > num_arr[j]) {
                    temp = num_arr[i];
                    num_arr[i] = num_arr[j];
                    num_arr[j] = temp;
                }
            }
            
        }
        
        answer = num_arr;
        
        return answer;
    }
}