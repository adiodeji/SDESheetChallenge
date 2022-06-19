class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] result = new StringBuilder[numRows]; 
        Boolean status=true; int j=0;
        for(int i=0; i<numRows; i++)result[i]= new StringBuilder();
        
        if(numRows==1)return s;
        
        for(int i=0; i<s.length(); i++){
          result[j].append(s.charAt(i));
          if(status==true)j++;
          if(status==false)j--;
          if(j==numRows){
              status=false;
              j=numRows-2;
          }
          else if(j==-1){
              j=1;
              status=true;
          }
        }
          
        StringBuilder output = new StringBuilder();
        
        for(int i=0; i<result.length; i++){
            output.append(result[i]);
        }
        
        return output.toString();
         
    }
}
