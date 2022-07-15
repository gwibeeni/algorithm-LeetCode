class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] answer = new int[encoded.length + 1];

        answer[0] = first;

        for (int index = 0; index < encoded.length; index++) {
            answer[index + 1] = answer[index] ^ encoded[index];
        }

        return answer;
    }
}
