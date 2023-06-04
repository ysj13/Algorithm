import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        if(num_list.length >= 11) {
            answer = Arrays.stream(num_list).reduce(0, (a, b) -> a + b);
        } else {
            answer = Arrays.stream(num_list).reduce(1, (a, b) -> a * b);
        }
        
        return answer;
    }
}