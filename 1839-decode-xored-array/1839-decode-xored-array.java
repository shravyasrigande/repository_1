class Solution {
    public int[] decode(int[] E, int first) {
        int n = E.length;
        int [] D = new int[n+1];
        D[0] = first;
        for(int i=1; i<=n ;i++){
            D[i] = D[i-1]^E[i-1];
        }
        return D;


        
    }
}