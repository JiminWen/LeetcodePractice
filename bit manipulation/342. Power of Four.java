public class Solution {
    public boolean isPowerOfFour(int num) {
    return Integer.toBinaryString(num).matches("1(00)*");    
    }
}