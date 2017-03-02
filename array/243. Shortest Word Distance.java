public class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
    if(words==null||words.length==0) return 0;
    int p1=-1,p2=-1,min=Integer.MAX_VALUE;
    for(int i=0;i<=words.length-1;++i){
        if(words[i].equals(word1)) p1=i;
        if(words[i].equals(word2)) p2=i;
        if(p1!=-1&&p2!=-1) min=Math.min(Math.abs(p1-p2),min);
    }
    return min;
    }
}