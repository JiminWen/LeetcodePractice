public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<List<String>>();
        if(s==null||s.length()==0) return res;
        backtracking(res,new ArrayList<String>(),s);
        return res;
    }
    private void backtracking(List<List<String>> res,List<String> temp,String s){
        if(s.length()==0){
            res.add(new ArrayList<String>(temp));
        }
        else{
            for(int i=0;i<s.length();++i){
                if(palindrome(s.substring(0,i+1))){
                    temp.add(s.substring(0,i+1));
                    backtracking(res,temp,s.substring(i+1,s.length()));
                    temp.remove(temp.size()-1);
                }
            }
        }
    }
    private boolean palindrome(String a){
        char[] ch=a.toCharArray();
        for(int i=0;i<=a.length()/2-1;++i){
            if(ch[i]!=ch[a.length()-i-1]) return false;
        }
        return true;
    }
}