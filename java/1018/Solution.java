import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> answer = new ArrayList<Boolean>();
        int remainder = 0;

        for (int num : nums) {
            remainder = ((remainder << 1) | num) % 5;
            answer.add(remainder == 0);
        }

        return answer;
    }
}
