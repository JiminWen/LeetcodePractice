public class Solution {
    public void reverseWords(char[] s) {
        if(s==null||s.length==0){
            return;
        }
        reverse(s,0,s.length-1);
        int low=0,high=0;
        while(high<=s.length-1){
        if(s[high]==' '){
            reverse(s,low,high-1);
            low=high+1;
        }
        ++high;    
        }
        reverse(s,low,s.length-1);
    }
    private void reverse(char[] s,int start,int end){
        while(start<end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            ++start;
            --end;
        }
    }
}