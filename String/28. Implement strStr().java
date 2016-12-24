public class Solution {
    public int strStr(String haystack, String needle) {
    if(haystack==null){
        return -1;
    }
    if(needle.length()==0){
        return 0;
    }
    
    
    for(int i=0;i<=haystack.length()-needle.length();++i){
        if(haystack.charAt(i)==needle.charAt(0)){
            StringBuilder sb=new StringBuilder();
            for(int j=i;j<=i+needle.length()-1;++j){
                sb.append(haystack.charAt(j));
            }
         if(sb.toString().equals(needle)){    
         return i;  
         }
        }
    }
    return -1;
    }
}