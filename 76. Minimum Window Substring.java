public class Solution {
    public String minWindow(String s, String t) {
    HashMap<Character,Integer> map=new HashMap<>();
    for(int i=0;i<t.length();++i){
        char m=t.charAt(i);
        map.put(m,map.getOrDefault(m,0)-1);
    }
    int start=0,end=0;
    String cur=null;
    while(start<s.length()&&end<s.length()){
        map.put(s.charAt(end),map.getOrDefault(s.charAt(end),0)+1);
        if(helper(map)){
            while(start<=end&&map.get(s.charAt(start))>0){
                map.put(s.charAt(start),map.get(s.charAt(start))-1);
                start++;
            }    
            String temp=s.substring(start,end+1);
            if(cur==null) cur=new String(temp);
            else if(temp.length()<cur.length()){
                cur=new String(temp); 
            }
            map.put(s.charAt(start),map.get(s.charAt(start))-1);
            start++;
        }
        end++;
    }
    return cur==null?"":cur;
    }
    public boolean helper(HashMap<Character,Integer> map){
    for(int m:map.values()){
        if(m<0) return false;
    }
    return true;
    }
}