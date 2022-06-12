import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        int num1=Integer.MAX_VALUE, num2=Integer.MIN_VALUE, count1=0, count2=0;
        for(int num: arr){
            if(num==num1)count1++;
            else if(num==num2)count2++;
            else if(count1==0){
                count1++;
                num1=num;
            }else if(count2==0){
                count2++;
                num2=num;
            }
            else{
                count1--;
                count2--;   
            }
        }    
        count1=0; count2=0;
        for(int num : arr){
            if(num==num1)count1++;
        }
        for(int num : arr){
            if(num==num2)count2++;
        }
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(count1>arr.size()/3)result.add(num1);
        if(count2>arr.size()/3)result.add(num2);
        
        return result;
    }
}
