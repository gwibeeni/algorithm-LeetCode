class Solution {
    public boolean sumGame(String num) {
        int blankCount = (int) num.chars()
            .filter(ch -> ch == '?')
            .count();

        if (blankCount % 2 != 0) {
            return true;
        }

        String[] nums = splitNum(num);

        String leftNum = nums[0];
        String rightNum = nums[1];

        return isNotMatchable(leftNum, rightNum);
    }

    private String[] splitNum(String num) {
        int chunkSize = num.length() / 2;
        return num.split("(?<=\\G.{" + chunkSize + "})");
    }

    private boolean isNotMatchable(String num1, String num2) {
        return digitOnlySum(replaceTwoBlankWithNine(num1)) != digitOnlySum(replaceTwoBlankWithNine(num2));
    }

    private int digitOnlySum(String num) {
        return num.chars()
            .filter(Character::isDigit)
            .map(ascii -> ascii - '0')
            .sum();
    }

    private String replaceTwoBlankWithNine(String num) {
        return num.replaceAll("\\?(\\d*)\\?", "9$1");
    }
}
