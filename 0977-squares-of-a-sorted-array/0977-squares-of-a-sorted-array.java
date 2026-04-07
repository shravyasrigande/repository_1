class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[] = new int[nums.length];
        int j=nums.length-1;
        int k = 0;
        for(int i=nums.length-1;i>=0;i--){
            if(Math.abs(nums[k])>Math.abs(nums[j])){
                ans[i] = nums[k]*nums[k];
                k++;
            }else{
                ans[i]=nums[j]*nums[j];
                j--;
            }


        }
        return ans;
        
    }
}