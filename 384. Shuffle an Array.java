public class Solution {
    int[] origin;
    Random random;
    public Solution(int[] nums) {
        origin=nums;
        random=new Random();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return origin;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] res=origin.clone();
        for(int i=1;i<res.length;++i){
            int j=random.nextInt(i+1);
            int temp=res[i];
            res[i]=res[j];
            res[j]=temp;
        }
        return res;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */