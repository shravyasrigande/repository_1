class Solution {
    public int passThePillow(int n, int time) {
        int comp = time/(n-1);
        int remain = time%(n-1);
        if(comp%2!=0){
            return n-remain;
        }
        else{
            return remain+1 ;
        }
        
    }
}