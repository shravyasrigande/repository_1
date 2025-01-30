class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int r = mat.length;
        int c = mat[0].length;
        
        int rotations = 0;  
        while (rotations < 4) {
            
            if (isEqual(mat, target)) return true;

            
            int[][] rotated = new int[c][r];  
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    rotated[j][r - 1 - i] = mat[i][j];
                }
            }

            mat = rotated;  
            r = mat.length; 
            c = mat[0].length; 

            rotations++; 
        }

        return false;  
    }

    private boolean isEqual(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
