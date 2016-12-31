public class Solution {
    public boolean canWin(String s) {
    if(s==null||s.length()<2){ 
    return false;
    }
    HashMap<String,Boolean> map=new HashMap<>();
    return canwin(s,map);
    
    }
    private boolean canwin(String s, HashMap<String,Boolean> map){
    if(map.containsKey(s)){
        return map.get(s);
    }
    for(int i=0;i<=s.length()-1;++i){
        if(s.startsWith("++",i)){
            String temp=s.substring(0,i)+"--"+s.substring(i+2);
            if(!canwin(temp,map)){
                map.put(s,true);
                return true;
            }
        }
    }
    map.put(s,false);
    return false;
    }
}