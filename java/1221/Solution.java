class Solution {
    public int balancedStringSplit(String s) {
        int answer = 0;
        int bias = 0;
        char[] letters = s.toCharArray();

        for (char letter : letters) {
            if (letter == 'L') {
                bias -= 1;
            } else {
                bias += 1;
            }

            if (bias == 0) {
                answer += 1;
            }
        }

        return answer;
    }
}
