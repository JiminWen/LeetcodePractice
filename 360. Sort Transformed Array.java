public class Solution {
    public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
    if(nums==null||nums.length==0) return new int[] {};    
    int start=0,end=nums.length-1;
    int i=a>=0?nums.length-1:0;
    int[] res=new int[nums.length];
    while(start<=end){
        int first=calculate(nums[start],a,b,c);
        int last=calculate(nums[end],a,b,c);
        if(a>=0){
            if(first>last){
                res[i--]=first;
                start++;
            }   
            else{
                res[i--]=last;
                end--;
            }
        }
        else{
            if(first<last){
                res[i++]=first;
                start++;
            }
            else{
                res[i++]=last;
                end--;
            }
        }
    }
    return res;
    }
    private int calculate(int x, int a, int b, int c){
    return a*x*x+b*x+c;    
    }
}