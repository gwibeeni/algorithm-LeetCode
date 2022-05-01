class Solution {
    public int countOdds(int low, int high) {
        int numCount = high - low + 1;
        int oddCount = numCount / 2;

        if (numCount % 2 != 0 &&
            low % 2 != 0) {
            oddCount += 1;
        }

        return oddCount;
    }
}
