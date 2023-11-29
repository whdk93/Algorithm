class Solution {
    public long solution(long n) {
        long answer = 0;
        
        //save temparary number
        String temp = "";
        
        //translate long type to string and split to string array
        String[] numlist = (Long.toString(n)).split("");
        
        for(int i=0; i<numlist.length; i++) {
            for(int j=i+1; j<numlist.length; j++) {
                int inum = Integer.parseInt(numlist[i]);
                int jnum = Integer.parseInt(numlist[j]);
                if(inum < jnum) {
                    temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }
        
        String numstr = "";
        
        for(int i=0; i<numlist.length; i++) {
            numstr += numlist[i];
        }
        
        answer = Long.parseLong(numstr);
        
        return answer;
    }
}