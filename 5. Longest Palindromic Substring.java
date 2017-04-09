public class Solution {
    int max=0,lo=0;
    public String longestPalindrome(String s) {
    if(s==null||s.length()==0) return s;
    for(int i=0;i<=s.length()-1;++i){
        expand(s,i,i);
        expand(s,i,i+1);
    }
    return s.substring(lo,lo+max);
    }
    private void expand(String s,int j,int k){
        while(j>-1&&k<s.length()&&s.charAt(j)==s.charAt(k)){
            j--;
            k++;
        }
        int len=k-j-1;
        if(len>max){
            lo=j+1;
            max=len;
        }
    }
}