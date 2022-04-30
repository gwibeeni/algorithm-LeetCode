class Solution {
    public int[] minOperations(String boxes) {
        int boxCount = boxes.length();
        int[] answer = new int[boxCount];

        Arrays.fill(answer, 0);

        int leftCost = 0;
        int leftCount = 0;
        for (int leftScanIndex = 0; leftScanIndex < boxCount - 1; leftScanIndex++) {
            if (boxes.charAt(leftScanIndex) == '1') {
                leftCount += 1;
            }

            leftCost += leftCount;

            answer[leftScanIndex + 1] += leftCost;
        }

        int rightCost = 0;
        int rightCount = 0;
        for (int rightScanIndex = boxCount - 1; rightScanIndex > 0; rightScanIndex--) {
            if (boxes.charAt(rightScanIndex) == '1') {
                rightCount += 1;
            }

            rightCost += rightCount;

            answer[rightScanIndex - 1] += rightCost;
        }

        return answer;
    }
}
