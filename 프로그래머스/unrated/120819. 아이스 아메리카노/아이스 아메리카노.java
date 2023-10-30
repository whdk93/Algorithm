class Solution {
    public int[] solution(int money) {
        int[] answer = {};
        
        int[] americano = {0, 0};
        
        americano[0] = (int)(money/5500);
        americano[1] = (int)(money%5500);
        
        answer = americano;
        
        return answer;
    }
}