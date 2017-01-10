public class Solution {
    public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> res=new ArrayList<>();
    backtracking(res,new ArrayList<Integer>(),nums);
    return res;
        
    }
    private void backtracking(List<List<Integer>> res,List<Integer> temp,int[] nums){
    if(temp.size()==nums.length){
        res.add(new ArrayList<Integer>(temp));
    }    
    else{
        for(int i=0;i<=nums.length-1;++i){
            if(temp.contains(nums[i])){
                continue;
            }
            temp.add(nums[i]);
            backtracking(res,temp,nums);
            temp.remove(temp.size()-1);
        }
        
    }
    
    
    }
}