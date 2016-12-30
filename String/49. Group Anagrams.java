public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list=new ArrayList<List<String>>();
        if(strs==null||strs.length==0){
            return list;
        }
        HashMap<String,List<String>> map=new HashMap<String,List<String>>();
        for(String str:strs){
            char[] c=str.toCharArray();
            Arrays.sort(c);
            String n=new String(c);
            if(!map.containsKey(n)){
                List<String> temp=new ArrayList<>();
                //list.add(str);
                map.put(n,temp);
            }
                map.get(n).add(str);
        }
        for(String s:map.keySet()){
            List<String> temp=map.get(s);
            
            list.add(temp);
        }
        return list;
    }
}