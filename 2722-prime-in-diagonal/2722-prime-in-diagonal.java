class Solution {
    public int diagonalPrime(int[][] nums) {
        int l = nums.length;
        int max =0;
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                if(i==j && is_prime(nums[i][j])){
                    if(max < nums[i][j]){
                        max = nums[i][j];
                    }
                }
                if(i+j == l-1 && is_prime(nums[i][j])){
                    if(max < nums[i][j]){
                        max = nums[i][j];
                    }
                }
            }
        }
        return max;
    }
        //return max;
   





    public boolean is_prime(int n) {
        if (n==1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
            return true;    

    }
    }
        
    