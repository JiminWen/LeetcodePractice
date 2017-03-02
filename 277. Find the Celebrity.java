      boolean knows(int a, int b); */

public class Solution extends Relation {
    public int findCelebrity(int n) {
    int p1=0,p2=1;
    while(p2<n){
        if(!knows(p2,p1)){
            p1=p2;
        }
        p2++;

    }
    for(int i=0;i<n;++i){
        if(i==p1) continue;
        if(knows(p1,i)||!knows(i,p1)) return -1;
    }
    return p1;
    
    }
}