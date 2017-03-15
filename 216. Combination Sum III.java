public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
    List<List<Integer>> res=new ArrayList<List<Integer>>();
    List<Integer> temp=new ArrayList<>();
    backtracking(res,temp,1,k,n);
    return res;
    }
    public void backtracking(List<List<Integer>> res, List<Integer> temp,int start,int k,int target){
    if(target==0&&temp.size()==k) res.add(new ArrayList<Integer>(temp));
    else if(temp.size()>k) return;
    else{
        for(int i=start;i<10;++i){
            if(temp.contains(i)) continue;
            temp.add(i);
            backtracking(res,temp,i+1,k,target-i);
            temp.remove(temp.size()-1);
        }
    }
        
    }
}