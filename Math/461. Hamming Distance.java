public class Solution {
    public int hammingDistance(int x, int y) {
    int xor=x^y;
    int count=0;
    for(int i=0;i<32;++i) {
        count+=xor&1;
        xor=xor>>1;
    }
    return count;
    }
}