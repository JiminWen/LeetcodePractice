public class Solution {
    public boolean isPowerOfThree(int n) {
    long temp=(long)Math.pow(3,20);
    return (n>0&&temp%n==0);    
    }
}