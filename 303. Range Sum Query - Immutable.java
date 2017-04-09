public class NumArray {
 //   int[] temp;
    int[] sum;
    public NumArray(int[] nums) {
        //temp=nums;
        if(nums.length!=0){
        sum=new int[nums.length];
        sum[0]=nums[0];
        for(int i=1;i<nums.length;++i) sum[i]=nums[i]+sum[i-1]; 
   //     System.out.print(sum);
        }
    }
    
    public int sumRange(int i, int j) {
    //    if(sum==null) return 0;
        if(i==0) return sum[j];
        return sum[j]-sum[i-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */