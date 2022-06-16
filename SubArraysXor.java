import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> A, int B) {
     HashMap<Integer,Integer> m = new HashMap<Integer,Integer>(); 
        int c = 0; 
        int xor = 0;
        int n = A.size();
        for(int i = 0;i<n;i++) {
            xor = xor ^ A.get(i); 
            if(m.containsKey(xor^B)) 
                c += m.get(xor ^ B); 
            if(xor == B) {
                c++; 
            }
                m.put(xor, m.getOrDefault(xor,0) + 1); 
        }
        return c; 
	}
}
