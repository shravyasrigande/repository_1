class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int arr[][] = new int[image.length][image[0].length];
        
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
               
                arr[i][j] = image[i][image[i].length - 1 - j] ^ 1;
            }
        }
        
        return arr;
    }
}
