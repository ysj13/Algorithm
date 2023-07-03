import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        List<String> list = new ArrayList<>();
        
        String temp = my_string;
        for(int i = 0; i < my_string.length(); i ++) {
        	list.add(temp.substring(i));
        }
        
        if(list.contains(is_suffix)) {
        	return 1;
        } else {
        	return 0;
        }
    }
}