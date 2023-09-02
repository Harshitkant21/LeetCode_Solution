class Solution {
    public int[][] transpose(int[][] matrix) {
        // Get the number of rows and columns in the input matrix.
        int r = matrix.length;       // Number of rows
        int c = matrix[0].length;    // Number of columns
        
        // Create a new matrix to store the transposed matrix with dimensions c x r.
        int[][] res = new int[c][r];
        
        // Iterate over each element in the original matrix.
        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; ++j) {
                // Swap rows and columns to transpose the element.
                res[j][i] = matrix[i][j];
            }
        }
        
        // Return the transposed matrix.
        return res;
    }
}

// Time Complexity: O(r * c)
// Space Complexity: O(c * r)
