class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String strx = Integer.toString(x);
        String[] strlist = strx.split("");
        
        int sum = 0;
        
        for(int i=0; i<strlist.length; i++) {
            sum += Integer.parseInt(strlist[i]);
        }

        if(x%sum == 0) {
            answer = true;
        }else {
            answer = false;
        }
        
        return answer;
    }
}