class Solution {
    public int solution(int[] num_list) {
        int a1 = 1;
        int a2 = 0;
        
        for(int i : num_list) {
            a1 *= i;
            a2 += i;
        }
        
        if(a1 < a2 * a2) {
            return 1;
        }
        
        return 0;
    }
}