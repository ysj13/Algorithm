class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(char c : myString.toCharArray()) {
            if(c == 'a') {
                answer += "A";
            } else if(c == 'A') {
                answer += "A";
            } else {
                answer += Character.toString(c).toLowerCase();
            }
        }
        
        return answer;
    }
}