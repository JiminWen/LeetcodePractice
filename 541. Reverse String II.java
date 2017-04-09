public class Solution {
    public String reverseStr(String s, int k) {
    if(s==null||s.length()==0||k==0) return s;
    StringBuilder res=new StringBuilder();
    for(int i=0;i<s.length();i+=2*k){
        StringBuilder sb=new StringBuilder();
        if(i+k-1>=s.length()-1){
            sb.append(s.substring(i));
            res.append(sb.reverse().toString());
            return res.toString();
        }
        else{
            sb.append(s.substring(i,i+k));
            res.append(sb.reverse().toString());
            if(i+2*k-1<=s.length()-1) res.append(s.substring(i+k,i+2*k));
            else res.append(s.substring(i+k));
        }
        
    }
    return res.toString();
    }
   
}