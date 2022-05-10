import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<>();

        int maxCandy = Arrays.stream(candies)
            .max()
            .getAsInt();

        int minRequiredCandy = maxCandy - extraCandies;

        for (int candy : candies) {
            answer.add(candy >= minRequiredCandy);
        }

        return answer;
    }
}
