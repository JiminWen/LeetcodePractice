public class Solution {
    public int reverse(int x) {
    boolean negative=x<0;
    if(negative){
        x=0-x;
    }
    int res=0;
    while(x>0){
        if(res>Integer.MAX_VALUE-x%10){
            res=0;
            break;
        }
        res+=x%10;
        x=x/10;
        if(x>0){
            if(res>Integer.MAX_VALUE/10){
                res=0;
                break;
            }
            res*=10;
        }
    }
    if(negative){
        res=-res;
    }
    return res;
    }
}