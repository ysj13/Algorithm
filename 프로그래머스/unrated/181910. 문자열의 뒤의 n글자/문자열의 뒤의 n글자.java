class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int startIndex = my_string.length() - n;
        for(int i = startIndex; i < n + startIndex; i++) {
            answer += my_string.charAt(i);
        }
        
        return answer;
    }
}