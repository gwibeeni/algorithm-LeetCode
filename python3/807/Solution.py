class Solution:
    def maxIncreaseKeepingSkyline(self, grid: List[List[int]]) -> int:
        answer = 0

        row_max = list(map(max, grid))
        col_max = list(map(max, list(zip(*grid))))

        for horizontal_index, row in enumerate(grid):
            for vertical_index, value in enumerate(row):
                answer += min(row_max[horizontal_index], col_max[vertical_index]) - grid[horizontal_index][vertical_index]

        return answer
