public class Solution {
    public boolean validWordSquare(List<String> words) {
    if(words==null||words.size()==0){
        return true;
    }
    for(int i=0;i<=words.size()-1;++i){
        String s=words.get(i);
        if(!vertical(words,i).equals(s)){
            return false;
        }    
    }
    return true;
    }
    private String vertical(List<String> words,int k){
       
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<=words.size()-1;++i){
            String word=words.get(i);
            if(k<word.length()){
            sb.append(word.charAt(k));    
            }
                
        }
        return sb.toString();
    }
}