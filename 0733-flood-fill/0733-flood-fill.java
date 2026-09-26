class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int original = image[sr][sc];

        if (original == color) {
            return image;
        }

        int rows = image.length;
        int cols = image[0].length;

        int[][] queue = new int[rows * cols][2];

        int head = 0;
        int tail = 0;

        queue[tail++] = new int[]{sr, sc};
        image[sr][sc] = color;

        int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };

        while (head < tail) {

            int r = queue[head][0];
            int c = queue[head][1];
            head++;

            for (int[] dir : directions) {

                int nr = r + dir[0];
                int nc = c + dir[1];

                if (nr >= 0 && nr < rows &&
                    nc >= 0 && nc < cols &&
                    image[nr][nc] == original) {

                    image[nr][nc] = color;
                    queue[tail++] = new int[]{nr, nc};
                }
            }
        }

        return image;
    }
}