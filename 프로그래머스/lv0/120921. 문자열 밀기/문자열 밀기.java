class Solution {
    public int solution(String A, String B) {
        int count = 0;

        for (int i = 0; i < A.length() + 1; i++) {
            if (B.equals(A)) {
                break;
            } else {
                char c = A.charAt(A.length() - 1);
                A = A.substring(0, A.length() - 1);
                A = c + A;
                count++;
            }
            
            if (count > A.length()) {
                count = -1;
            }
        }

        return count;
    }
}