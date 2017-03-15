public class Solution {
    public List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> res=new ArrayList<List<Integer>>();
    List<Integer> temp=new ArrayList<Integer>();
    backtracking(res,temp,1,n,k);
    return res;
    }
    public void backtracking(List<List<Integer>> list,List<Integer> temp,int start,int n,int k){
    if(temp.size()==k) list.add(new ArrayList<Integer>(temp));
    else{
        for(int i=start;i<=n;++i){
        temp.add(i);
        backtracking(list,temp,i+1,n,k);
        temp.remove(temp.size()-1);
        }
    }
    }
}