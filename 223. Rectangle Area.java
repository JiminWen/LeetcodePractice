public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
    int row1=C-A,col1=D-B,row2=G-E,col2=H-F;
    if(A>=G||C<=E) return row1*col1+row2*col2;
    if(B>=H||D<=F) return row1*col1+row2*col2;
    int length=Math.min(C,G)-Math.max(A,E);
    int height=Math.min(D,H)-Math.max(B,F);
    return row1*col1+row2*col2-height*length;
    
    }
}