class Solution {
    public static boolean isAngle(int ang) {
        if(ang < 0 || ang >180) {
            System.out.println("range error");
            return false;
        }
        return true;
        
    }
    
    public int solution(int angle) {
        int answer = 0;
        
        if(isAngle(angle)) {
            if(angle > 0 && angle < 90) {
                answer = 1;
            }else if(angle == 90) {
                answer = 2;
            }else if(angle > 90 && angle <180){
                answer = 3;
            }else if( angle == 180) {
                answer = 4;
            }
        }
        
        return answer;
    }
}