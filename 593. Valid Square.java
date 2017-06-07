public class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int length[]={getlength(p1,p2),getlength(p1,p3),getlength(p1,p4),getlength(p2,p3),getlength(p2,p4),getlength(p3,p4)};
        int max=0,nonmax=0;
        int countMax=0 ;
        for(int m:length){
            if(m>=max) {
                max=m;
            }
        }
        for(int m:length){
            if(m==max) countMax++;
            else nonmax=m;
        }
        if(countMax!=2) return false;
        for(int m:length){
            if(m!=max&&m!=nonmax) return false;
        }
        return true;
    }
    private int getlength(int[] p1, int[] p2){
        return (int)Math.pow(p1[0]-p2[0],2)+(int)Math.pow(p1[1]-p2[1],2);
    }
}