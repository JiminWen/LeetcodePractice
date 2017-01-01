public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
    List<String> res=new ArrayList<>();
    if(s==null||s.length()<10){
        return res;
    }
    HashMap<String,Integer> map=new HashMap<>();
    for(int i=9;i<=s.length()-1;++i){
        String temp=s.substring(i-9,i+1);
        if(map.containsKey(temp)){
            map.put(temp,map.get(temp)+1);
            if(map.get(temp)==1){
                res.add(temp);
            }
        }
        else{
            map.put(temp,0);
        }
        
    }
    return res;
    }
}