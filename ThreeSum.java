
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        
        List<List<Integer>> res = new ArrayList();
     
        Arrays.sort(nums);
        
        Set<List<Integer>> m = new HashSet<>();
        Set<Integer> n = new HashSet<>();
         
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1; j<nums.length;j++){
            if(n.contains(-(nums[i]+nums[j]))){
               
                ArrayList<Integer> r = new ArrayList<Integer>();
                r.add(nums[i]);
                r.add(nums[j]);
                r.add( -(nums[i]+nums[j]) );
                
             
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
