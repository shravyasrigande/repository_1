class Solution {
    public boolean isPerfectSquare(int num) {
        if (num==1)
        return true;
        long low = 0;
        long high = num;
        while(low<=high){
            long mid = low+(high-low)/2;
            long res = mid * mid;
            if(res == num){
                return true;
            }
            if(res>num){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return false;
        
    }
}