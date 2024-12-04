class Solution {
    public List<List<Integer>> generate(int numRows) {
        int arr[][] = new int[numRows][];
        for (int i = 0; i < numRows; i++) {
            arr[i] = new int[i + 1];
            arr[i][0] = arr[i][i] = 1;
            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int[] row : arr) {
            List<Integer> list = new ArrayList<>();
            for (int val : row) {
                list.add(val);
            }
            result.add(list);
        }
        return result;
    }
}