class Solution {
    public int[] twoSum(int[] nums, int target) {
               
        //Using HashMap
        
    
        HashMap<Integer,Integer> n = new HashMap<>(nums.length);
        for(int i=0; i<nums.length;i++){
            if(n.containsKey(target-nums[i]))return new int[]{i, n.get(target-nums[i])};
            else n.put(nums[i],i);
        }
        
        return new int[]{};
        
    }
}
