class Solution:
    def decode(self, encoded: List[int], first: int) -> List[int]:
        answer = [first]

        for index, code in enumerate(encoded):
            answer.append(answer[index]^code)

        return answer
