class Solution {
    public int[] solution(int[] arr, int k) {
        boolean flag = false;	// 짝수 = true, 홀수 = false
        
        if(k % 2 != 0) {
        	return fun(arr, k , flag);
        } else {
            flag = true;
            return fun(arr, k , flag);
        }
    }
    
    static int[] fun(int[] arr , int k, boolean flag) {
        int[] answer = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            // 짝수
            if(flag) {
                answer[i] = arr[i] + k;
            } else {
                answer[i] = arr[i] * k;
            }
        }

        return answer;
    }
}