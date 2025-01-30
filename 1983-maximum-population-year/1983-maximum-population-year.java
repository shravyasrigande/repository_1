class Solution {
    public int maximumPopulation(int[][] logs) {
        int arr[] = new int[2051];
        for (int i = 0; i < logs.length; i++) {
             int[] pop = logs[i];
             arr[pop[0]]++;
             arr[pop[1]]--;
        }
        int temp =0;
        int max=0;
        int year =0;
        for(int i=1950;i<2051;i++){
            temp+=arr[i];
            if(temp>max){
                max = temp;
                year =i;
            }
        }
        return year;
        
    }
}