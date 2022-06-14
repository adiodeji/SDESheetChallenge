class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        
         
        List<List<Integer>> res = new ArrayList();
     
       Arrays.sort(nums);
        
        Set<List<Integer>> m = new HashSet<>();
        Set<Integer> n = new HashSet<>();
        
         
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1; j<nums.length-1;j++){
               for(int k=j+1;k<nums.length; k++)
            if(n.contains(target-(nums[i]+nums[j]+nums[k]))){
               
                ArrayList<Integer> r = new ArrayList<Integer>();
                r.add(nums[i]);
                r.add(nums[j]);
                r.add(nums[k]);
                r.add(target-(nums[i]+nums[j]+nums[k]));
                
             
                if(!m.contains(r)){
                    res.add(r);
                    m.add(r);
                }
                 
            }
       
        }
             n.add(nums[i]);
    }
        
    return res;
        
    }
}
