public class Solution {
    public char findTheDifference(String s, String t) {
    int num=t.charAt(t.length()-1)-'a';
    for(int i=0;i<=s.length()-1;++i){
        num^=(s.charAt(i)-'a');
        num^=(t.charAt(i)-'a');
    }
    char res=(char)(num+'a');
    return res;
       
    }
}