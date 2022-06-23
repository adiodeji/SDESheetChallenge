public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> str = new HashMap<Character,Integer>(); 
        int start=0; int len=0;
        for(int i=0; i<s.length(); i++){
            while(str.containsKey(s.charAt(i))){
                str.remove(s.charAt(start++));
            }
            str.put(s.charAt(i),1);
            len=Math.max(i-start+1,len);
        }
        return len;
    }
}
