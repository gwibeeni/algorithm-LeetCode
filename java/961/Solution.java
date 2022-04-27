class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> checkedNums = new HashSet<>();

        for (int num : nums) {
            if (checkedNums.contains(num)) {
                return num;
            }

            checkedNums.add(num);
        }

        return -1;
    }
}

