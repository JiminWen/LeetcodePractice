public class Solution {
    public int trap(int[] height) {
    if(height.length<3){
        return 0;    
    }
    int l=0,r=height.length-1,res=0;
    while(l<r&&height[l]<=height[l+1]){
        ++l;
    }
    while(l<r&&height[r-1]>=height[r]){
        --r;
    }
    while(l<r){
        int left=height[l],right=height[r];
        if(left<=right){
            while(l<r&&left>=height[l]){
                res+=left-height[l];
                ++l;
            }
        }
        else{
            while(l<r&&right>=height[r]){
                res+=right-height[r];
                --r;
            }
        }
    }
    return res;
    }
}