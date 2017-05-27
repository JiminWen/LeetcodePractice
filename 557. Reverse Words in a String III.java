public class Solution {
    public String reverseWords(String s) {
    if(s==null||s.length()==0){
        return s;
    }   
    String[] str=s.split(" ");
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<str.length-1;++i){
        StringBuilder temp=new StringBuilder(str[i]);
        sb.append(temp.reverse());
        sb.append(" ");
    }
    StringBuilder temp=new StringBuilder(str[str.length-1]);
    sb.append(temp.reverse());
    return sb.toString();
        
    }
}