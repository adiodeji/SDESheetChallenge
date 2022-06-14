/*Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
*/

class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> allNums = new HashSet<Integer>();
        
        int max=0,count=0, tempNum=0;
        
        for(int num: nums)allNums.add(num);
        
        for(int num: nums){
            if(!allNums.contains(num-1)){
                count=1;
                tempNum=num+1;
                
                while(allNums.contains(tempNum)){
                    count++;
                    tempNum=tempNum+1;
                }
            }
            
            max=Math.max(max,count);
            
        }
        
        return max;
        
    }
}
