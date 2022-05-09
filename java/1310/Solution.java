class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int arrayCount = arr.length;
        int queryCount = queries.length;

        int[] answer = new int[queryCount];
        int[] xors = new int[arrayCount];

        xors[0] = arr[0];

        for (int arrayIndex = 1; arrayIndex < arrayCount; arrayIndex++) {
            xors[arrayIndex] = xors[arrayIndex - 1] ^ arr[arrayIndex];
        }

        for (int queryIndex = 0; queryIndex < queryCount; queryIndex++) {
            int[] query = queries[queryIndex];

            int startIndex = query[0];
            int endIndex = query[1];

            answer[queryIndex] = arr[startIndex] ^ xors[startIndex] ^ xors[endIndex];
        }

        return answer;
    }
}
