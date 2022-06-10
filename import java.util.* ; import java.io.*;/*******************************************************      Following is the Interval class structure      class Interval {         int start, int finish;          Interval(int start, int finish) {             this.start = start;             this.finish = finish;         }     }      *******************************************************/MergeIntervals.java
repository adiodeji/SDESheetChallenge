
import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
          Arrays.sort(intervals,(a,b)-> a.start - b.start);
        LinkedList<Interval>result = new LinkedList<Interval>();
        
        for(Interval interval : intervals ){
            if(result.isEmpty() || result.getLast().finish <interval.start) result.add(interval);
            else result.getLast().finish = Math.max(interval.finish,result.getLast().finish);
            
        }
        
        return result;
    }
}
