public class Solution {
    public List<String> generateAbbreviations(String word) {
    List<String> res=new ArrayList<String>();
    //if(word==null||word.length()==0) return res;
    String temp=new String();
    backtracking(res,temp,word,0,0);
    return res;
    }
    public void backtracking(List<String> list,String temp,String word,int pos,int count){
    if(pos==word.length()){
        if(count>0) temp+=count;
        list.add(temp);
    }   
    else{
        backtracking(list,temp,word,pos+1,count+1);
        backtracking(list,temp+(count==0?"":count)+word.charAt(pos),word,pos+1,0);
    }
    
    }
}