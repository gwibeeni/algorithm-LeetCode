class Solution:
    def xorQueries(self, arr: List[int], queries: List[List[int]]) -> List[int]:
        answer = []

        xors = []
        xors.append(arr[0])

        for index in range(1, len(arr)):
            xors.append(xors[-1] ^ arr[index])

        for query in queries:
            start_index = query[0]
            end_index = query[1]

            answer.append(arr[start_index] ^ xors[start_index] ^ xors[end_index])

        return answer
