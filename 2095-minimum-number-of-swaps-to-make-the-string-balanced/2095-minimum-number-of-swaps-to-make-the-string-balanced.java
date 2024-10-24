class Solution {
    public int minSwaps(String s) {
        int n=0;
        for(char ch:s.toCharArray()){
            if(ch=='['){
                n++;
            }
            else if (n>0){
                n--;
            }
        }
        return (n+1)/2;
        
    }
}