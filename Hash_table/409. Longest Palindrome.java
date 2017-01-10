public class Solution {
    public int longestPalindrome(String s) {
    if(s==null||s.length()==0){
        return 0;
    }
    int count=0;
    HashSet<Character> set=new HashSet<>();
    for(int i=0;i<=s.length()-1;++i){
        if(set.contains(s.charAt(i))){
            ++count;
            set.remove(s.charAt(i));
        }
        else{
            set.add(s.charAt(i));
        }
    }
    if(set.isEmpty()){
        return 2*count;
    }
    return count*2+1;
    
    }
}