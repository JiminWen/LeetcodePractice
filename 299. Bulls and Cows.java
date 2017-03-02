public class Solution {
    public String getHint(String secret, String guess) {
    int[] n1=new int[10];
    int[] n2=new int[10];
    int bull=0,cow=0;
    for(int i=0;i<secret.length();++i){
        if(secret.charAt(i)==guess.charAt(i)) bull++;
        else{
            n1[secret.charAt(i)-'0']++;
            n2[guess.charAt(i)-'0']++;
        }
    }
    for(int i=0;i<10;++i){
        cow+=Math.min(n1[i],n2[i]);
    }
    return bull+"A"+cow+"B";
    }
}