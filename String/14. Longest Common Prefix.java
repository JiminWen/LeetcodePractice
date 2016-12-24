public class Solution {
    public String longestCommonPrefix(String[] strs) {
    StringBuilder sb=new StringBuilder();
    if(strs==null||strs.length==0){
        return sb.toString();
    }    
    int min=strs[0].length();
    for(int i=1;i<=strs.length-1;++i){
        min=Math.min(min,strs[i].length());
    }
    int i=0;
    while (i<min){
        char temp=strs[0].charAt(i);
        for(int j=1;j<=strs.length-1;++j){
            if(strs[j].charAt(i)!=temp){
                return sb.toString();
            }
        }
        sb.append(temp);
        ++i;
    }
    return sb.toString();
    }
}