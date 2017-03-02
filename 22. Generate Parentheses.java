public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        if(n<0) return res;
        backtracking(res,new String(),0,0,n);
        return res;
        
    }
    private void backtracking(List<String> res,String str,int left,int right,int n){
        if(str.length()==2*n) res.add(new String(str));
        else{
            if(left<n) {
                backtracking(res,str+"(",left+1,right,n);
                
                
            }
            if(right<left) {
                backtracking(res,str+")",left,right+1,n);
            
                
            }
                
            }
    }
}