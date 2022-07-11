import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int answer = 0;

        List<Integer> rowMax = Arrays.stream(grid)
            .map(this::getMaxInt)
            .collect(Collectors.toList());

        List<Integer> colMax = Arrays.stream(transpose(grid))
            .map(this::getMaxInt)
            .collect(Collectors.toList());

        for(int horizontalIndex = 0; horizontalIndex < grid.length; horizontalIndex++) {
            for (int verticalIndex = 0; verticalIndex < grid[0].length; verticalIndex++) {
                answer += Math.min(rowMax.get(horizontalIndex), colMax.get(verticalIndex)) - grid[horizontalIndex][verticalIndex];
            }
        }

        return answer;
    }

    private int[][] transpose(int[][] origin) {
        int width = origin.length;
        int height = origin[0].length;

        int[][] transposed = new int[height][width];

        for(int horizontalIndex = 0; horizontalIndex < width; horizontalIndex++) {
            for (int verticalIndex = 0; verticalIndex < height; verticalIndex++) {
                transposed[verticalIndex][horizontalIndex] = origin[horizontalIndex][verticalIndex];
            }
        }

        return transposed;
    }

    private int getMaxInt(int[] from) {
        return Arrays.stream(from)
            .max()
            .getAsInt();
    }
}
