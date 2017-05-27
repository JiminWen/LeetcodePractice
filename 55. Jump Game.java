public class Solution {
    public boolean canJump(int[] nums) {
    if((nums==null)||(nums.length==0)){
        return false;
    }    
    boolean res=true,temp=false;
    for(int i=0;i<=nums.length-1;++i){
        if(nums[i]==0){
        temp=false;
            if(i==nums.length-1){return res;}
            for(int j=0;j<=i-1;++j){
                if(nums[j]+j>i){
                    temp=true;
                }
            }
        if(temp==false){res=false;}    
        }
    }
    return res;
    }
}