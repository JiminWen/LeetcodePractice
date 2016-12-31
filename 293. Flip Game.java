public class Solution {
    public List<String> generatePossibleNextMoves(String s) {
    List<String> res=new ArrayList<>();
    if(s==null||s.length()<2){
        return res;
    }
    for(int i=0;i<=s.length()-2;++i){
        if(s.charAt(i)=='+'&&s.charAt(i+1)=='+'){
            res.add(s.substring(0,i)+"--"+s.substring(i+2));
            
        }    
        
    }
    return res;
    }
}


//Amazing method 
public List<String> generatePossibleNextMoves(String s) {
    List list = new ArrayList();
    for (int i=-1; (i = s.indexOf("++", i+1)) >= 0; )
        list.add(s.substring(0, i) + "--" + s.substring(i+2));
    return list;
}