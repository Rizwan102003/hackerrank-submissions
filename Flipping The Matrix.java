class Result {
    /*
     * Complete the 'flippingMatrix' function below.
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
     */
    public static int flippingMatrix(List<List<Integer>> matrix) {
        int n = matrix.size() / 2;
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int a = matrix.get(i).get(j);
                int b = matrix.get(i).get(2 * n - 1 - j);
                int c = matrix.get(2 * n - 1 - i).get(j);
                int d = matrix.get(2 * n - 1 - i).get(2 * n - 1 - j);
                maxSum += Math.max(Math.max(a, b), Math.max(c, d));
            }
        }
        return maxSum;
    }
}

/*
DO DRY RUN 
For each cell (i, j) in the upper-left n x n quadrant, you select the maximum value that can go there from the 4 symmetric positions, made available via flips:
- (i, j)
- (i, 2n - 1 - j)
- (2n - 1 - i, j)
- (2n - 1 - i, 2n - 1 - j)

(i,j)         (i, 2n-1-j)
   +---------------+
   | A       |  B  |
---+---------+-----+
   | C       |  D  |
   +---------------+
(2n-1-i,j)   (2n-1-i,2n-1-j)

*/