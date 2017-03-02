public class Solution {
    public int hIndex(int[] citations) {
    if(citations==null||citations.length==0) return 0;
    int[] bucket=new int[citations.length+1];
    for(int temp:citations){
        if(temp>citations.length) bucket[citations.length]++;
        else bucket[temp]++;
    }
    int count=0;
    for(int i=bucket.length-1;i>=0;--i){
        count+=bucket[i];
        if(i<=count){
            return i;
        }
    }
    return 0;
    
    }
}