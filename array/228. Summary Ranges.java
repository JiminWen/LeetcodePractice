public class Solution {
    public List<String> summaryRanges(int[] nums) {
    List<String> list=new ArrayList<>();
    if(nums==null||nums.length==0){
        return list;    
    }
    for(int i=0;i<=nums.length-1;++i){
        int index=i;
        while(i+1<=nums.length-1&&nums[i+1]-nums[i]==1){
            ++i;
        }
        if(i==index){
            list.add(nums[i]+"");
        }
        else{
            list.add(nums[index]+"->"+nums[i]);
        }
    }
    return list;
    }
}