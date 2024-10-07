class Solution {
    public int maximumWealth(int[][] accounts) {
        int count =0;
        for(int i=0;i<accounts.length;i++){
            int temp =0;
            for(int j=0;j<accounts[i].length;j++){
                temp  = temp+accounts[i][j];

            }
            count = Math.max(count,temp);

        }
        return count;
        
    }
}