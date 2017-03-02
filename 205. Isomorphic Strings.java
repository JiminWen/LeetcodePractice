public class Solution {
    public boolean isIsomorphic(String s, String t) {
    if(s.length()!=t.length()) return false;
    char[] ch1=new char[256];
    char[] ch2=new char[256];
    for(int i=0;i<s.length();++i){
        char t1=s.charAt(i);
        char t2=t.charAt(i);
        if(ch1[t1]==0&&ch2[t2]==0){
            ch1[t1]=t2;
            ch2[t2]=t1;
        }
        else{
            if(ch1[t1]!=t2||ch2[t2]!=t1){
                return false;
            }
        }
            
    }
    return true;
    }
}