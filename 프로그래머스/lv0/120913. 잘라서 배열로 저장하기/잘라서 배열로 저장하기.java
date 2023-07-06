class Solution {
    public String[] solution(String my_str, int n) {
		int my_strLength = my_str.length();
		int answerLength = my_strLength % n == 0 ? my_strLength / n : (my_strLength / n) + 1;
		
        String[] answer = new String[answerLength];
        int count = 1;
        String temp = "";
        int a = 0;
        
        System.out.println(answerLength);
        for(int i = 0; i < my_strLength; i++) {
            if(count <= n) {
                temp += my_str.charAt(i);
                count++;
            }
            
            if(count > n || i == my_strLength - 1) {
                answer[a++] = temp;
                temp = "";
                count = 1;
            } 

        }
        
        return answer;
    }
}