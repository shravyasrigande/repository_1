class Solution {
    public int largestAltitude(int[] gain) {
        int arr[] = new int[gain.length+1];
        for(int i=0;i<gain.length;i++){
            arr[0] = 0;
            arr[i+1] = gain[i]+arr[i];
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}