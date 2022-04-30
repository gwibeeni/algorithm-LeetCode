class Solution:
    def minOperations(self, boxes: str) -> List[int]:
        count_boxes = len(boxes)
        answer = [0] * count_boxes

        cost_left = 0
        ball_left = 0
        for left_scan_index in range (0, count_boxes - 1):
            if boxes[left_scan_index] == '1':
                ball_left += 1

            cost_left += ball_left

            answer[left_scan_index + 1] += cost_left

        cost_right = 0
        ball_right = 0
        for right_scan_index in range (count_boxes - 1, 0, -1):
            if boxes[right_scan_index] == '1':
                ball_right += 1

            cost_right += ball_right

            answer[right_scan_index - 1] += cost_right

        return answer
