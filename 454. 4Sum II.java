public class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
    HashMap<Integer,Integer> map=new HashMap<>();
    int res=0;
    for(int a:A){
        for(int b:B){
            int sum=a+b;
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
    }
    
    for(int c:C){
        for(int d:D){
            int sum=c+d;
            res+=map.getOrDefault(-sum,0);
        }
    }
    return res;
    
        
    }
}