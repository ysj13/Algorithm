import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int n) {
        String answer = my_string.chars()
                            .limit(n)
                            .mapToObj(ch -> String.valueOf((char) ch))
                            .collect(Collectors.joining());
        return answer;
    }
}