import java.util.Arrays;

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int[] array = new int[n * n];
        
        
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        
        Arrays.sort(array);

        
        return array[k - 1];
    }
}
