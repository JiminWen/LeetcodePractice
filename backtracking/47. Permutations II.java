public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
    List<List<Integer>> res=new ArrayList<List<Integer>>();
    if(nums==null||nums.length==0){
        return res;
    }
    Arrays.sort(nums);
    helper(res,new ArrayList<Integer>(),nums,new boolean[nums.length]);
    return res;
    }
    private void helper(List<List<Integer>> res,List<Integer> temp,int[] nums,boolean[] used){
    if(temp.size()==nums.length){
        res.add(new ArrayList<Integer>(temp));
    }   
    else{
        for(int i=0;i<=nums.length-1;++i){
        if(used[i]||i>0&&nums[i]==nums[i-1]&&!used[i-1]){
            continue;
        }
        used[i]=true;
        temp.add(nums[i]);
        helper(res,temp,nums,used);
        used[i]=false;
        temp.remove(temp.size()-1);
    }
    }
    }
}