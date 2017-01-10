public class Solution {
    public boolean canPermutePalindrome(String s) {
    if(s==null||s.length()==0){
        return true;
    }
    int count=0;
    HashSet<Character> set=new HashSet<>();
    for(int i=0;i<=s.length()-1;++i){
        if(set.contains(s.charAt(i))){
           set.remove(s.charAt(i)); 
           --count;
        }
        else{
           set.add(s.charAt(i));
           ++count;
        }
    }
    return count<2;
    
    
    
    }
}

//Top solution
public boolean canPermutePalindrome(String s) {
  Set<Character>set = new HashSet<Character>();
  for (char c : s.toCharArray())  
    if (set.contains(c)) set.remove(c);// If char already exists in set, then remove it from set
    else set.add(c);// If char doesn't exists in set, then add it to set
  return set.size() <= 1;
}