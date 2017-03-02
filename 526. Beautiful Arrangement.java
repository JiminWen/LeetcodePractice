public class Solution {
    int res=0;
    public int countArrangement(int N) {
    if(N<1) return 0;
    int[] used=new int[N+1];
    backtracking(N,used,1);
    return res;
    }
    private void backtracking(int N,int[] used,int pos){
    if(pos==N+1) {
        res++;
        
    }    
    else{
        for(int i=1;i<=N;++i){
            if(used[i]!=0) continue;
            if(i%pos!=0&&pos%i!=0) continue;
        //    pos++;
            used[i]=1;
            backtracking(N,used,pos+1);
            used[i]=0;
            //pos--;
        }    
    }
    
    }
}