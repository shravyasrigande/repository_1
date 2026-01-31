class Solution {
    public int majorityElement(int[] nums) {
      HashMap<Integer,Integer> hm = new HashMap<>();
      for(int n :nums){
        hm.put(n,hm.getOrDefault(n,0)+1);
      }
      int leng = nums.length;
      int me = leng/2;
      for(Map.Entry<Integer,Integer>e : hm.entrySet()){
        if(e.getValue()>me){
            return e.getKey();
        }
      }
      return 0;
        
    }
}