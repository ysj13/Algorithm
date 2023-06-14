import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
		List<Integer> list = new ArrayList<>();		
		list = Arrays.stream(num_list)
                .boxed()
                .collect(Collectors.toList());

		int length = num_list.length;
        int lastNum = num_list[length - 1];
		
		if(lastNum > num_list[length - 2]) {
			list.add(lastNum - num_list[length - 2]);
		} else if(lastNum <= num_list[length - 2]) {
			list.add(lastNum * 2);
		}
        
        int[] answer = list.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        
        return answer;
    }
}